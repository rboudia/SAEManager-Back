package org.univ_paris8.iut.montreuil.saemanagerback.mapper;

import org.univ_paris8.iut.montreuil.saemanagerback.dto.PersonneDTO;
import org.univ_paris8.iut.montreuil.saemanagerback.dto.RessourceDTO;
import org.univ_paris8.iut.montreuil.saemanagerback.entity.PersonneEntity;
import org.univ_paris8.iut.montreuil.saemanagerback.entity.Ressource;

public class RessourceMapper {
    public RessourceDTO toDTO(Ressource ressource) {
        RessourceDTO dto = new RessourceDTO(
                ressource.getIdRessource(),
                ressource.getContenu(),
                ressource.getCouleur(),
                ressource.getNom());

        return dto;
    }

    public Ressource toEntity(RessourceDTO dto) {
        Ressource ressource = new Ressource();
        ressource.setIdRessource(dto.getIdRessource());
        ressource.setContenu(dto.getContenu());
        ressource.setCouleur(dto.getCouleur());
        ressource.setNom(dto.getNom());

        return ressource;
    }
}

