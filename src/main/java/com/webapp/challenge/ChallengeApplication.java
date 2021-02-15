package com.webapp.challenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import java.io.File;

@Configuration
@SpringBootApplication
public class ChallengeApplication {

    public static void main(String[] args) {
        final boolean mkdir = new File(Controller.UPLOADDIRECTORY).mkdir();
        SpringApplication.run(ChallengeApplication.class, args);
    }
}
