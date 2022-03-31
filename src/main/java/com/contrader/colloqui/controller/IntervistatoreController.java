package com.contrader.colloqui.controller;

import com.contrader.colloqui.JWTDemo;
import com.contrader.colloqui.dto.IntervistatoreDTO;
import com.contrader.colloqui.service.IntervistatoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/intervistatore")
public class IntervistatoreController {

    @Autowired
    private IntervistatoreService intervistatoreService;

    @PostMapping("/login")
    public String doLogin(@RequestBody IntervistatoreDTO intervistatoreDTO) {

        if (intervistatoreService.doLogin(intervistatoreDTO.getUsername(), intervistatoreDTO.getPassword()) != null) {
            String jwt = JWTDemo.createJWT(intervistatoreDTO.getId(), intervistatoreDTO.getUsername());

            // TEST
            System.out.println(intervistatoreDTO.toString());
            return jwt;
        }

        return "Dati errati";
    }

    @PostMapping("/insert")
    public void insert(@RequestBody IntervistatoreDTO intervistatoreDTO) {
        intervistatoreService.insert(intervistatoreDTO);
    }
}
