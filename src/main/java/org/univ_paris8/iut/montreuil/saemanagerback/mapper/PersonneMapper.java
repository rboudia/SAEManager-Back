package org.univ_paris8.iut.montreuil.saemanagerback.mapper;

import org.univ_paris8.iut.montreuil.saemanagerback.dto.PersonneDTO;
import org.univ_paris8.iut.montreuil.saemanagerback.entity.PersonneEntity;

public class PersonneMapper {

    public PersonneDTO toDTO(PersonneEntity entity) {
        PersonneDTO dto = new PersonneDTO(
                entity.getIdPersonne(),
                entity.getNom(),
                entity.getPrenom(),
                entity.getPhotoDeProfil(),
                entity.getEmail());

        return dto;
    }

    public PersonneEntity toEntity(PersonneDTO dto) {
        PersonneEntity entity = new PersonneEntity();

        entity.setIdPersonne(dto.getIdPersonne());
        entity.setNom(dto.getNom());
        entity.setPrenom(dto.getPrenom());
        entity.setPhotoDeProfil(dto.getPhotoDeProfil());
        entity.setEmail(dto.getEmail());

        return entity;
    }
}
