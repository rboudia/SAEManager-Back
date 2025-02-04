package org.univ_paris8.iut.montreuil.saemanagerback.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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


}
