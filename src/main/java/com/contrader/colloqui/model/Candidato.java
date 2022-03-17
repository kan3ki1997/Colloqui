package com.contrader.colloqui.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Candidato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // tutto obbligatorio tranne lista competenze
    @Column
    private String nome, cognome,mesiEsperienza,note;
    //private List<String>listaDiCompetenze;
    private int valutazioneTecnica,valutazioneCaratteriale,autonomia,resilienza,proattività,precisione,commitment,
            valutazioneComplessiva,posizioneInGraduatoria;

}
