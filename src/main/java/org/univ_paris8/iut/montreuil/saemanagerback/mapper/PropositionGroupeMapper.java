package org.univ_paris8.iut.montreuil.saemanagerback.mapper;

import org.univ_paris8.iut.montreuil.saemanagerback.dto.PropositionGroupeDTO;
import org.univ_paris8.iut.montreuil.saemanagerback.entity.PropositionGroupe;

public class PropositionGroupeMapper extends BaseMapper<PropositionGroupe, PropositionGroupeDTO> {

    @Override
    public PropositionGroupeDTO toDTO(PropositionGroupe entity) {

        PropositionGroupeDTO dto = new PropositionGroupeDTO(
                entity.getIdProposition(),
                entity.getSae(),
                entity.getNom(),
                entity.getEdit()
        );

        return dto;
    }

    @Override
    public PropositionGroupe toEntity(PropositionGroupeDTO dto) {
        PropositionGroupe entity = new PropositionGroupe();

        entity.setIdProposition(dto.getIdProsition());
        entity.setSae(dto.getSae());
        entity.setNom(dto.getNom());
        entity.setEdit(dto.getEdit());

        return entity;
    }
}
