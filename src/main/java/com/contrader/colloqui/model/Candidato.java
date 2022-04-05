package com.contrader.colloqui.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import javax.validation.constraints.Null;
import java.util.HashMap;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "candidati")
public class Candidato {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // tutto obbligatorio tranne lista competenze
    @Column
    private String nome, cognome, mesiEsperienza, note;

    @Column
    private HashMap<String, Integer> listaDiCompetenze;

    @Column
    private int valTecnica, valCarattere, autonomia, resilienza, proattivita, precisione, commitment,
            valComplessiva;

    public Candidato(String nome, String cognome, String mesiEsperienza, String note, Long id, int valTecnica, int valCarattere, int autonomia, int resilienza, int proattivita, int precisione, int commitment, int valComplessiva) {
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
