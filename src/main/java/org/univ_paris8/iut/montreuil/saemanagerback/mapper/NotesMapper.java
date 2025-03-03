package org.univ_paris8.iut.montreuil.saemanagerback.mapper;

import org.univ_paris8.iut.montreuil.saemanagerback.dto.NotesDTO;
import org.univ_paris8.iut.montreuil.saemanagerback.entity.NotesEntity;

public class NotesMapper extends BaseMapper<NotesEntity, NotesDTO> {

    @Override
    public NotesDTO toDTO(NotesEntity entity) {
        NotesDTO dto = new NotesDTO(
                entity.getIdEval(),
                entity.getIdEleve(),
                entity.getIdRendu(),
                entity.getNote()
        );

        return dto;
    }

    @Override
    public NotesEntity toEntity(NotesDTO dto) {
        NotesEntity entity = new NotesEntity();

        entity.setIdEval(dto.getIdEval());
        entity.setIdEleve(dto.getIdEleve());
        entity.setIdRendu(dto.getIdRendu());
        entity.setNote(dto.getNote());

        return entity;
    }
}
