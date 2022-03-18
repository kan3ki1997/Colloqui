package com.contrader.colloqui.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document("utenteFiltrato")
public class UtenteFiltrato {

    private String nomeUtente, cognomeUtente;
    private int valutazioneComplessiva;

}
