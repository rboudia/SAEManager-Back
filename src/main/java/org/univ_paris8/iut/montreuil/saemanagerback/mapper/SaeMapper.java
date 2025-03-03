package org.univ_paris8.iut.montreuil.saemanagerback.mapper;

import org.univ_paris8.iut.montreuil.saemanagerback.dto.SaeDTO;
import org.univ_paris8.iut.montreuil.saemanagerback.entity.Sae;

public class SaeMapper extends BaseMapper<Sae, SaeDTO> {

    @Override
    public SaeDTO toDTO(Sae entity) {

        SaeDTO dto = new SaeDTO(
                entity.getIdSAE(),
                entity.getNomSae(),
                entity.getAnneeUniversitaire(),
                entity.getSemestreUniversitaire(),
                entity.getSujet(),
                entity.getDateModificationSujet(),
                entity.getResponsable()
        );

        return dto;
    }

    @Override
    public Sae toEntity(SaeDTO dto) {

        Sae entity = new Sae();

        entity.setIdSAE(dto.getIdSae());
        entity.setNomSae(dto.getNomSae());
        entity.setAnneeUniversitaire(dto.getAnneeUniversitaire());
        entity.setSemestreUniversitaire(dto.getSemestreUniversitaire());
        entity.setSujet(dto.getSujet());
        entity.setDateModificationSujet(dto.getDateModificationSujet());
        entity.setResponsable(dto.getResponsablesSae());

        return entity;

    }

}
