package org.univ_paris8.iut.montreuil.saemanagerback.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.univ_paris8.iut.montreuil.saemanagerback.dto.GroupeDTO;
import org.univ_paris8.iut.montreuil.saemanagerback.service.GroupeService;

@RestController
@RequestMapping("groupe")
@CrossOrigin(origins = "http://localhost:4200")
public class GroupeController {

    private final GroupeService groupeService;

    public GroupeController(GroupeService groupeService) {
        this.groupeService = groupeService;
    }


    @PostMapping
    public ResponseEntity<String> createGroupe(@RequestBody GroupeDTO groupeDTO) {
        groupeService.createGroupe(groupeDTO);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
