package org.univ_paris8.iut.montreuil.saemanagerback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.univ_paris8.iut.montreuil.saemanagerback.dto.SaeDTO;
import org.univ_paris8.iut.montreuil.saemanagerback.entity.Sae;
import org.univ_paris8.iut.montreuil.saemanagerback.repository.SaeRepository;
import org.univ_paris8.iut.montreuil.saemanagerback.service.SaeService;

@RestController
@RequestMapping("sae")
public class SaeController {

    private final SaeService saeService;

    @Autowired
    public SaeController(SaeService saeService) {
        this.saeService = saeService;
    }

    @PostMapping("/create")
    public ResponseEntity<SaeDTO> createSae(@RequestBody SaeDTO saeDTO) {
        SaeDTO createdSae = saeService.createSae(saeDTO);
        return ResponseEntity.ok(createdSae);
    }


}
