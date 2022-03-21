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

    public CandidatoDTO(String nome, String cognome, String mesiEsperienza, String note, String _id, int valTecnica, int valCarattere, int autonomia, int resilienza, int proattivita, int precisione, int commitment, int valComplessiva) {
        this.nome = nome;
        this.cognome = cognome;
        this.mesiEsperienza = mesiEsperienza;
        this.note = note;
        this.id = _id;
        this.valTecnica = valTecnica;
        this.valCarattere = valCarattere;
        this.autonomia = autonomia;
        this.resilienza = resilienza;
        this.proattivita = proattivita;
        this.precisione = precisione;
        this.commitment = commitment;
        this.valComplessiva = valComplessiva;
    }
}
