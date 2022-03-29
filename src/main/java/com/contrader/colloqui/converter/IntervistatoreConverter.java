package com.contrader.colloqui.converter;

import com.contrader.colloqui.dto.IntervistatoreDTO;
import com.contrader.colloqui.model.Intervistatore;
import org.springframework.stereotype.Component;

@Component
public class IntervistatoreConverter extends AbstractConverter<Intervistatore, IntervistatoreDTO> {

    @Override
    public Intervistatore toEntity(IntervistatoreDTO intervistatoreDTO) {
        Intervistatore intervistatore = null;
        if (intervistatoreDTO != null) {
            intervistatore = new Intervistatore(intervistatoreDTO.getUsername(), intervistatoreDTO.getPassword(),intervistatoreDTO.getId());
        }
        return intervistatore;
    }

    @Override
    public IntervistatoreDTO toDTO(Intervistatore intervistatore) {
        IntervistatoreDTO intervistatoreDTO = null;
        if (intervistatore != null) {
            intervistatoreDTO = new IntervistatoreDTO(intervistatore.getUsername(), intervistatore.getPassword(),intervistatore.getId());
        }
        return intervistatoreDTO;
    }
}
