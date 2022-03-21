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

    public Candidato(String nome, String cognome, String mesiEsperienza, String note, String _id, int valTecnica, int valCarattere, int autonomia, int resilienza, int proattivita, int precisione, int commitment, int valComplessiva) {
        this.nome = nome;
        this.cognome = cognome;
        this.mesiEsperienza = mesiEsperienza;
        this.note = note;
        this._id = _id;
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
