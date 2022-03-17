package com.contrader.colloqui.converter;

import com.contrader.colloqui.dto.CandidatoDTO;
import com.contrader.colloqui.model.Candidato;
import org.springframework.stereotype.Component;

@Component
public class CandidatoConverter extends AbstractConverter<Candidato, CandidatoDTO>{

    @Override
    public Candidato toEntity(CandidatoDTO candidatoDTO) {
        Candidato candidato = null;
        if (candidatoDTO!=null){
            candidato = new Candidato(candidatoDTO.getNome(),candidatoDTO.getCognome(),
                    candidatoDTO.getMesiEsperienza(),candidatoDTO.getNote(),"",candidatoDTO.getValutazioneTecnica(),
                    candidatoDTO.getValutazioneCaratteriale(),candidatoDTO.getAutonomia(),candidatoDTO.getResilienza(),
                    candidatoDTO.getProattività(),candidatoDTO.getPrecisione(),candidatoDTO.getCommitment(),
                    candidatoDTO.getValutazioneComplessiva(),candidatoDTO.getPosizioneInGraduatoria());
            return candidato;
        }
        return candidato;
    }

    @Override
    public CandidatoDTO toDTO(Candidato candidato) {
        CandidatoDTO candidatoDTO = null;
        if (candidato!=null){
            candidatoDTO = new CandidatoDTO(candidato.getNome(),candidato.getCognome(),
                    candidato.getMesiEsperienza(),candidato.getNote(),"",candidato.getValutazioneTecnica(),
                    candidato.getValutazioneCaratteriale(),candidato.getAutonomia(),candidato.getResilienza(),
                    candidato.getProattività(),candidato.getPrecisione(),candidato.getCommitment(),
                    candidato.getValutazioneComplessiva(),candidato.getPosizioneInGraduatoria());
            return candidatoDTO;
        }
        return candidatoDTO;
    }
}
