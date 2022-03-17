package com.contrader.colloqui.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CandidatoDTO {

    private String nome, cognome,mesiEsperienza,note,id;
    //private List<String>listaDiCompetenze;
    private int valutazioneTecnica,valutazioneCaratteriale,autonomia,resilienza,proattività,precisione,commitment,
            valutazioneComplessiva,posizioneInGraduatoria;

}
