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
            candidato = new Candidato(candidatoDTO.getNome(),candidatoDTO.getCognome(),candidatoDTO.getMesiEsperienza(),
                    candidatoDTO.getNote(),candidatoDTO.getId(),candidatoDTO.getListaDiCompetenze(),candidatoDTO.getValTecnica(),
                    candidatoDTO.getValCarattere(),candidatoDTO.getAutonomia(),candidatoDTO.getResilienza(),candidatoDTO.getProattivita(),
                    candidatoDTO.getPrecisione(), candidatoDTO.getCommitment(), candidatoDTO.getValComplessiva());
            return candidato;
        }
        return candidato;
    }

    @Override
    public CandidatoDTO toDTO(Candidato candidato) {
        CandidatoDTO candidatoDTO = null;
        if (candidato!=null){
            candidatoDTO = new CandidatoDTO(candidato.getNome(),candidato.getCognome(),
                    candidato.getMesiEsperienza(),candidato.getNote(),candidato.get_id(),candidato.getListaDiCompetenze(),
                    candidato.getValTecnica(), candidato.getValCarattere(),candidato.getAutonomia(),candidato.getResilienza(),
                    candidato.getProattivita(),candidato.getPrecisione(),candidato.getCommitment(),
                    candidato.getValComplessiva());
            return candidatoDTO;
        }
        return candidatoDTO;
    }
}
