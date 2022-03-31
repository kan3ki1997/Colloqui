package com.contrader.colloqui.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UtenteFiltratoDTO {

    private Long id;
    private String nomeUtente, cognomeUtente;
    private int valutazioneComplessiva;

}
