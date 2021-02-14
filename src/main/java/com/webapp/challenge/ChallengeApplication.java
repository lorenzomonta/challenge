package com.webapp.challenge;

import check.numbers.CSVReaderInJava;
import check.numbers.Number;
import check.numbers.Validator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.List;

@SpringBootApplication
public class ChallengeApplication {

    public static final String PATH = "/Users/lorenzomontanari/Downloads/South_African_Mobile_Numbers.csv";

    public static void main(String[] args) {
        SpringApplication.run(ChallengeApplication.class, args);
        /*CSVReaderInJava csvReader = new CSVReaderInJava();
        List<Number> numbers = csvReader.readBooksFromCSV(PATH);
        Validator validator = new Validator(numbers);
        validator.validateNumbers();

        Number num = new Number("123456789", "27831234567");
        Validator v = new Validator(num);
        v.validateNumber();
        System.out.println(v.getNumber());*/


        /* let's print a few numbers read from CSV file */
        /*
        for (Number i : numbers) {
            if (i.isCorrect()) System.out.println(i);
            //if (!i.isCorrect()) System.out.println(i);
        }
        */
    }
}
