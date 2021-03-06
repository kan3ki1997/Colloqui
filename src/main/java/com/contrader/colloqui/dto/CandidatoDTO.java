package com.contrader.colloqui.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import java.util.HashMap;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CandidatoDTO {

    private Long id;

    @NotNull
    private String nome, cognome,mesiEsperienza,note;

    @NotNull
    private HashMap<String, Integer> listaDiCompetenze;

    @NotNull
    @Max(10)
    private int valTecnica, valCarattere,autonomia,resilienza;

    @NotNull
    @Max(5)
    private int proattivita,precisione,commitment;

    @NotNull
    @Max(30)
    private  int valComplessiva;

    public CandidatoDTO(String nome, String cognome, String mesiEsperienza, String note, Long id, int valTecnica, int valCarattere, int autonomia, int resilienza, int proattivita, int precisione, int commitment, int valComplessiva) {
        this.nome = nome;
        this.cognome = cognome;
        this.mesiEsperienza = mesiEsperienza;
        this.note = note;
        this.id = id;
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
