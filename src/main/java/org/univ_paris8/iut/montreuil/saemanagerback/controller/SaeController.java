package org.univ_paris8.iut.montreuil.saemanagerback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.univ_paris8.iut.montreuil.saemanagerback.dto.PersonneDTO;
import org.univ_paris8.iut.montreuil.saemanagerback.dto.SaeDTO;
import org.univ_paris8.iut.montreuil.saemanagerback.entity.Sae;
import org.univ_paris8.iut.montreuil.saemanagerback.repository.SaeRepository;
import org.univ_paris8.iut.montreuil.saemanagerback.service.SaeService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
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

    @GetMapping("/list")
    public ResponseEntity<List<SaeDTO>> getAllSaes() {
        List<SaeDTO> saeList = saeService.getAllSaes();
        return ResponseEntity.ok(saeList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SaeDTO> getSaes(@PathVariable("id") int id) {
        SaeDTO saeDto = saeService.getSae(id);
        return ResponseEntity.ok(saeDto);
    }







}
