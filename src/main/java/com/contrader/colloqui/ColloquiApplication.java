package com.contrader.colloqui;

import com.contrader.colloqui.dto.IntervistatoreDTO;
import com.contrader.colloqui.service.IntervistatoreService;
import com.contrader.colloqui.service.RoleService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class ColloquiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ColloquiApplication.class, args);
    }

//    @Bean
    CommandLineRunner run(IntervistatoreService intervistatoreService, RoleService roleService){
        return args -> {
            intervistatoreService.insert(new IntervistatoreDTO(null,"admin","admin",roleService.read(1),true));
        };
    }

    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
