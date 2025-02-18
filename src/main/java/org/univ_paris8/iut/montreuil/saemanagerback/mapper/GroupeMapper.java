package org.univ_paris8.iut.montreuil.saemanagerback.mapper;

import org.univ_paris8.iut.montreuil.saemanagerback.dto.GroupeDTO;
import org.univ_paris8.iut.montreuil.saemanagerback.entity.Groupe;

public class GroupeMapper extends BaseMapper<Groupe, GroupeDTO> {

    @Override
    public GroupeDTO toDTO(Groupe entity) {

        GroupeDTO dto = new GroupeDTO(
                entity.getIdGroupe(),
                entity.getNom(),
                entity.getImageTitre(),
                entity.getSae(),
                entity.getEstModifiableParEleve()
        );

        return dto;
    }

    @Override
    public Groupe toEntity(GroupeDTO dto) {
        Groupe entity = new Groupe();
        entity.setIdGroupe(dto.getIdGroupe());
        entity.setNom(dto.getNom());
        entity.setImageTitre(dto.getImageTitre());
        entity.setSae(dto.getSae());
        entity.setEstModifiableParEleve(dto.getEstModifiableParEleve());

        return entity;
    }
}
