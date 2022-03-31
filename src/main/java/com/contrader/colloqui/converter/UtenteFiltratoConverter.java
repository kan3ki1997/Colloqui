package com.contrader.colloqui.converter;

import com.contrader.colloqui.dto.UtenteFiltratoDTO;
import com.contrader.colloqui.model.UtenteFiltrato;
import org.springframework.stereotype.Component;

@Component
public class UtenteFiltratoConverter extends AbstractConverter<UtenteFiltrato, UtenteFiltratoDTO>{

    @Override
    public UtenteFiltrato toEntity(UtenteFiltratoDTO utenteFiltratoDTO) {
        UtenteFiltrato graduatoria = null;
        if (utenteFiltratoDTO!=null){
            graduatoria = new UtenteFiltrato(utenteFiltratoDTO.getId(),utenteFiltratoDTO.getNomeUtente(),utenteFiltratoDTO.getCognomeUtente(),utenteFiltratoDTO.getValutazioneComplessiva());
            return graduatoria;
        }
        return graduatoria;
    }

    @Override
    public UtenteFiltratoDTO toDTO(UtenteFiltrato utenteFiltrato) {
        UtenteFiltratoDTO utenteFiltratoDTO = null;
        if (utenteFiltrato!=null){
            utenteFiltratoDTO = new UtenteFiltratoDTO(utenteFiltrato.getId(),utenteFiltrato.getNomeUtente(),utenteFiltrato.getCognomeUtente(),utenteFiltrato.getValutazioneComplessiva());
            return utenteFiltratoDTO;
        }
        return utenteFiltratoDTO;
    }
}
