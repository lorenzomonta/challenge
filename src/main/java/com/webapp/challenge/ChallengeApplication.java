package com.webapp.challenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import java.io.File;

@Configuration
@SpringBootApplication
public class ChallengeApplication {

    public static void main(String[] args) {
        //create a new directory for the .csv file
        new File(Controller.UPLOADDIRECTORY).mkdir();
        // start the web application
         SpringApplication.run(ChallengeApplication.class, args);
    }
}
