package com.webapp.challenge;

import check.numbers.Number;
import check.numbers.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }


    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String processCheckNumber (@ModelAttribute Number num, Model model){
        Validator v = new Validator(num);
        v.validateNumber();
        model.addAttribute("annotation", v.getNumber().getAnnotation());
        //System.out.println(v.getNumber());
        return "index";
    }
}
