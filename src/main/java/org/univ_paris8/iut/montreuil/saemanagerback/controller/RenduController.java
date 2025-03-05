package org.univ_paris8.iut.montreuil.saemanagerback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.univ_paris8.iut.montreuil.saemanagerback.dto.RenduDTO;
import org.univ_paris8.iut.montreuil.saemanagerback.service.RenduService;

@RestController
@RequestMapping("rendu")
@CrossOrigin(origins = "http://localhost:4200")
public class RenduController {

    private final RenduService renduService;

    @Autowired
    public RenduController(RenduService renduService) {
        this.renduService = renduService;
    }


    @PostMapping
    public ResponseEntity<String> createRendu(@RequestBody RenduDTO renduDTO) {
        renduService.createRendu(renduDTO);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
