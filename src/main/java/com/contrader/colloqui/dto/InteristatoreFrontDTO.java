package com.contrader.colloqui.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document("intervistatoreFrontDTO")
public class InteristatoreFrontDTO { // creo un nuovo dto perché il jwt non è reperibile quando convertiamo nelle classi converter

    private String username;
    private String password;
    private String id;
    private String jwt; // messo nel dto perché viene salvato solo lato client con il front end
}
