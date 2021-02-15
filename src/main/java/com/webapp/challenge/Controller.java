package com.webapp.challenge;

import check.numbers.CSVReaderInJava;
import check.numbers.Number;
import check.numbers.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    protected static final String UPLOADDIRECTORY = System.getProperty("user.dir") + "/uploads";
    protected StringBuilder fileNames;

    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }


    @RequestMapping(value = "/validatenumber", method = RequestMethod.POST)
    public String processCheckNumber (@ModelAttribute Number num, Model model){
        Validator v = new Validator(num);
        v.validateNumber();
        model.addAttribute("annotation", v.getNumber().getAnnotation());
        return "index";
    }

    @RequestMapping(value = "/validatenumbers")
    public String upload(Model model, @RequestParam("files") MultipartFile[] files) {
        fileNames = new StringBuilder();
        for (MultipartFile file : files) {
            Path fileNameAndPath = Paths.get(UPLOADDIRECTORY, file.getOriginalFilename());
            fileNames.append(file.getOriginalFilename());
            try {
                Files.write(fileNameAndPath, file.getBytes());
            } catch (IOException e) {
                model.addAttribute("msg", "No file has been selected!");
                e.printStackTrace();
                return "validatenumbers";
            }
        }
        String path = UPLOADDIRECTORY + "/" + fileNames;
        CSVReaderInJava csvReader = new CSVReaderInJava();
        List<Number> numbers = csvReader.readBooksFromCSV(path);
        if (numbers == null){
            model.addAttribute("msg", "Please upload a .csv file with the correct format, for example: 103343262,27831234567");
            return "validatenumbers";
        }
        Validator validator = new Validator(numbers);
        validator.validateNumbers();
        model.addAttribute("msg", "Successfully uploaded files " + fileNames.toString());
        model.addAttribute("listNumbers", validator.getNumbers());
        return "validatenumbers";
    }
}
