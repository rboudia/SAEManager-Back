package org.univ_paris8.iut.montreuil.saemanagerback.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.univ_paris8.iut.montreuil.saemanagerback.dto.PersonneDTO;
import org.univ_paris8.iut.montreuil.saemanagerback.service.PersonneService;

import java.util.List;

@RestController
@RequestMapping("personne")
public class PersonneController {

    private final PersonneService personneService;

    @Autowired
    public PersonneController(PersonneService personneService) {
        this.personneService = personneService;
    }

    @GetMapping
    public List<PersonneDTO> getPersonnes() {
        return personneService.getPersonnes();
    }

    @GetMapping("/prof")
    public List<PersonneDTO> getProfesseurs() {
        return personneService.getPersonnesByEstProf(1);
    }

    @GetMapping("/etudiant")
    public List<PersonneDTO> getEtudiants() {
        return personneService.getPersonnesByEstProf(0);
    }

    @PutMapping("/prof/ajouterProf/{id}")
    public ResponseEntity<String> ajouterProf(@PathVariable Integer id) {
        String response = personneService.updateEstProf(1, id);

        if (response != null) {
            return ResponseEntity.ok(response);
        }
        else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("La personne avec l'ID : " + id + ", n'existe pas");
        }
    }

    @PutMapping("/prof/supprimerProf/{id}")
    public ResponseEntity<String> supprimerProf(@PathVariable Integer id) {
        String response = personneService.updateEstProf(0, id);

        if (response != null) {
            return ResponseEntity.ok(response);
        }
        else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("La personne avec l'ID : " + id + ", n'existe pas");
        }
    }

}
