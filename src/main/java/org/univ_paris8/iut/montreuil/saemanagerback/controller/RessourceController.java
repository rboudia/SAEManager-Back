package org.univ_paris8.iut.montreuil.saemanagerback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.univ_paris8.iut.montreuil.saemanagerback.dto.PersonneDTO;
import org.univ_paris8.iut.montreuil.saemanagerback.dto.RessourceDTO;
import org.univ_paris8.iut.montreuil.saemanagerback.service.PersonneService;
import org.univ_paris8.iut.montreuil.saemanagerback.service.RessourceService;

import java.util.List;

@RestController
@RequestMapping("ressource")
@CrossOrigin(origins = "http://localhost:4200")
public class RessourceController {

    private final RessourceService ressourceService;

    @Autowired
    public RessourceController(RessourceService ressourceService) {
        this.ressourceService = ressourceService;
    }

    @GetMapping
    public List<RessourceDTO> getRessources() {
        return ressourceService.getAllRessources();
    }
}
