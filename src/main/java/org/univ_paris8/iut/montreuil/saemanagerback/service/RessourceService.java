package org.univ_paris8.iut.montreuil.saemanagerback.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.univ_paris8.iut.montreuil.saemanagerback.dto.PersonneDTO;
import org.univ_paris8.iut.montreuil.saemanagerback.dto.RessourceDTO;
import org.univ_paris8.iut.montreuil.saemanagerback.mapper.PersonneMapper;
import org.univ_paris8.iut.montreuil.saemanagerback.mapper.RessourceMapper;
import org.univ_paris8.iut.montreuil.saemanagerback.repository.PersonneRepository;
import org.univ_paris8.iut.montreuil.saemanagerback.repository.RessourceRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RessourceService {
    private final RessourceRepository ressourceRepository;
    private final RessourceMapper ressourceMapper;


    @Autowired
    public RessourceService(RessourceRepository ressourceRepository) {
        this.ressourceRepository = ressourceRepository;
        this.ressourceMapper = new RessourceMapper();
    }

    public List<RessourceDTO> getAllRessources() {
        return ressourceRepository.findAll()
                .stream()
                .map(ressourceMapper::toDTO)
                .collect(Collectors.toList());
    }
}


