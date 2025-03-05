package org.univ_paris8.iut.montreuil.saemanagerback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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

    @DeleteMapping("/{id}")
    public void deleteRessource(@PathVariable int id) {
        ressourceService.deleteRessource(id);
    }

    @PostMapping
    public RessourceDTO createRessource(@RequestBody RessourceDTO ressourceDTO) {
        return ressourceService.createRessource(ressourceDTO);
    }


}
