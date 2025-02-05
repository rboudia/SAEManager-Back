package org.univ_paris8.iut.montreuil.saemanagerback.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.univ_paris8.iut.montreuil.saemanagerback.dto.PersonneDTO;
import org.univ_paris8.iut.montreuil.saemanagerback.service.PersonneService;
import org.springframework.web.bind.annotation.CrossOrigin;


import java.util.List;

@RestController
@RequestMapping("personne")
@CrossOrigin(origins = "http://localhost:4200")
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

    @PutMapping("/prof/ajouterProf")
    public ResponseEntity<String> ajouterProf(@RequestBody List<Integer> idsPersonne) {
        try {
            String response = personneService.updateEstProf(1, idsPersonne);
            return ResponseEntity.ok(response);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }


    @PutMapping("/prof/supprimerProf")
    public ResponseEntity<String> supprimerProf(@RequestBody List<Integer> idsPersonne) {
        try {
            String response = personneService.updateEstProf(0, idsPersonne);
            return ResponseEntity.ok(response);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }


    @PostMapping
    public ResponseEntity<PersonneDTO> addPersonne(@RequestBody PersonneDTO personneDTO) {
        return ResponseEntity.ok(personneService.addPersonne(personneDTO));
    }
}
