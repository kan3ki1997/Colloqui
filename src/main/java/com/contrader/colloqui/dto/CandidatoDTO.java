package com.contrader.colloqui.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CandidatoDTO {

    private String nome, cognome,mesiEsperienza,note,id;
    private HashMap<String, Integer> listaDiCompetenze;
    private int valTecnica, valCarattere,autonomia,resilienza,proattivita,precisione,commitment,
            valComplessiva;

}
