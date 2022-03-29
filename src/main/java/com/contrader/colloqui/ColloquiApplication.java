package com.contrader.colloqui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.xml.bind.DatatypeConverter;

@Configuration
@SpringBootApplication

public class ColloquiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ColloquiApplication.class, args);
    }

}
