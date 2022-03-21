package com.contrader.colloqui.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.persistence.*;
import java.util.HashMap;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document("candidati")
public class Candidato {

    // tutto obbligatorio tranne lista competenze
    private String nome, cognome,mesiEsperienza,note;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String _id;

    private HashMap<String, Integer> listaDiCompetenze;

    private int valTecnica, valCarattere,autonomia,resilienza,proattivita,precisione,commitment,
            valComplessiva;

}
