package com.contrader.colloqui.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document("candidati")
public class Candidato {

    // tutto obbligatorio tranne lista competenze
    private String nome, cognome,mesiEsperienza,note,id;
    //private List<String>listaDiCompetenze;
    private int valutazioneTecnica,valutazioneCaratteriale,autonomia,resilienza,proattività,precisione,commitment,
            valutazioneComplessiva,posizioneInGraduatoria;

}
