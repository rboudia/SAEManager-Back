package org.univ_paris8.iut.montreuil.saemanagerback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.univ_paris8.iut.montreuil.saemanagerback.dto.RessourceSaeDTO;
import org.univ_paris8.iut.montreuil.saemanagerback.entity.RessourceSAE;
import org.univ_paris8.iut.montreuil.saemanagerback.service.RessourceSaeService;

import java.util.List;

@RestController
@RequestMapping("ressourceSae")
@CrossOrigin(origins = "http://localhost:4200")
public class RessourceSaeController {

    private final RessourceSaeService ressourceSaeService;

    @Autowired
    public RessourceSaeController(RessourceSaeService ressourceSaeService) {
        this.ressourceSaeService = ressourceSaeService;

    }


    @GetMapping
    public List<RessourceSaeDTO> getRessourcessae() {
        System.out.println("dans le controller");
        return ressourceSaeService.getAllRessourcessae();
    }

    @PostMapping
    public ResponseEntity<RessourceSAE> createRessourceSae(@RequestBody RessourceSaeDTO ressourceSaeDTO) {
        RessourceSAE createdRessourceSae = ressourceSaeService.createRessourceSae(ressourceSaeDTO);
        return ResponseEntity.ok(createdRessourceSae);
    }

    @DeleteMapping("/{idSae}/{idRessource}")
    public ResponseEntity<Void> deleteRessourceSae(
            @PathVariable Integer idSae,
            @PathVariable Integer idRessource) {
        ressourceSaeService.deleteRessourceSae(idSae, idRessource);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{idSae}")
    public ResponseEntity<List<RessourceSaeDTO>> getRessourcesBySae(@PathVariable Integer idSae) {
        List<RessourceSaeDTO> ressources = ressourceSaeService.getRessourcesBySae(idSae);
        return ResponseEntity.ok(ressources);
    }


}
