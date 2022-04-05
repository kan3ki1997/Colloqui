package com.contrader.colloqui.controller;

import com.contrader.colloqui.JWTDemo;
import com.contrader.colloqui.dto.IntervistatoreDTO;
import com.contrader.colloqui.service.IntervistatoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/intervistatore")
public class IntervistatoreController {

    @Autowired
    private IntervistatoreService intervistatoreService;

    @PostMapping("/login")
    public String doLogin(@RequestBody IntervistatoreDTO intervistatore) {
        IntervistatoreDTO intervistatoreDTO = intervistatoreService.getByUsernameAndPassword(intervistatore.getUsername(),intervistatore.getPassword());

        if (intervistatoreDTO != null) {
            String jwt = JWTDemo.createJWT(intervistatoreDTO.getId(), intervistatoreDTO.getUsername());
            return jwt;
        }

        return "Dati errati";
    }

    @PostMapping("/insert")
    public void insert(@RequestBody IntervistatoreDTO intervistatoreDTO) {
        intervistatoreService.insert(intervistatoreDTO);
    }
}
