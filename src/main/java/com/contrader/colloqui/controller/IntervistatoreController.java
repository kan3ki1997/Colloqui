package com.contrader.colloqui.controller;

import com.contrader.colloqui.dto.IntervistatoreDTO;
import com.contrader.colloqui.service.IntervistatoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/intervistatore")
public class IntervistatoreController {

    @Autowired
    private IntervistatoreService intervistatoreService;

    @GetMapping("/login")
    public boolean doLogin(@RequestBody IntervistatoreDTO intervistatoreDTO) {
        if (intervistatoreService.doLogin(intervistatoreDTO.getUsername(), intervistatoreDTO.getPassword()) != null) {
            return true;
        }

        return false;
    }

    @PostMapping("/insert")
    public void insert(@RequestBody IntervistatoreDTO intervistatoreDTO){
        intervistatoreService.insert(intervistatoreDTO);
    }
}
