package org.univ_paris8.iut.montreuil.saemanagerback.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.univ_paris8.iut.montreuil.saemanagerback.dto.SaeDTO;
import org.univ_paris8.iut.montreuil.saemanagerback.entity.PersonneEntity;
import org.univ_paris8.iut.montreuil.saemanagerback.entity.Sae;
import org.univ_paris8.iut.montreuil.saemanagerback.entity.ResponsablesSae;
import org.springframework.stereotype.Component;
import org.univ_paris8.iut.montreuil.saemanagerback.repository.PersonneRepository;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class SaeMapper {

    private final ResponsableSaeMapper responsableSaeMapper;
    private final PersonneRepository personneRepository;

    @Autowired
    public SaeMapper(ResponsableSaeMapper responsableSaeMapper, PersonneRepository personneRepository) {
        this.responsableSaeMapper = responsableSaeMapper;
        this.personneRepository = personneRepository;
    }

    public SaeDTO toDto(Sae entity) {
        if (entity == null) {
            return null;
        }

        return new SaeDTO(
                entity.getNomSae(),
                entity.getAnneeUniversitaire(),
                entity.getSemestreUniversitaire(),
                entity.getSujet(),
                entity.getDateModificationSujet(),
                entity.getListeResponsables() != null ?
                        entity.getListeResponsables().stream()
                                .map(responsableSaeMapper::toDto)
                                .collect(Collectors.toList())
                        : null
        );
    }

    public Sae toEntity(SaeDTO dto) {
        if (dto == null) {
            return null;
        }

        Sae entity = new Sae();

        entity.setNomSae(dto.getNomSae());
        entity.setAnneeUniversitaire(dto.getAnneeUniversitaire());
        entity.setSemestreUniversitaire(dto.getSemestreUniversitaire());
        entity.setSujet(dto.getSujet());
        entity.setDateModificationSujet(dto.getDateModificationSujet());

        if (dto.getListeResponsablesSaeDto() != null) {
            entity.setListeResponsables(
                    dto.getListeResponsablesSaeDto().stream()
                            .map(responsableDTO -> {
                                // Récupération de l'entité `PersonneEntity`
                                PersonneEntity responsable = personneRepository.findById(responsableDTO.getIdResp()).orElse(null);
                                return responsableSaeMapper.toEntity(responsableDTO, entity, responsable);
                            })
                            .collect(Collectors.toList())
            );
        }

        return entity;

    }
}
