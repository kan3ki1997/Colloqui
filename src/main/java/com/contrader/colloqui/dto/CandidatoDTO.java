package com.contrader.colloqui.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CandidatoDTO {

    private Long id;
    private String nome, cognome,mesiEsperienza,note;
    //private List<String>listaDiCompetenze;
    private int valutazioneTecnica,valutazioneCaratteriale,autonomia,resilienza,proattività,precisione,commitment,
            valutazioneComplessiva,posizioneInGraduatoria;

}
