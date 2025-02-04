package org.univ_paris8.iut.montreuil.saemanagerback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.univ_paris8.iut.montreuil.saemanagerback.dto.NotesDTO;
import org.univ_paris8.iut.montreuil.saemanagerback.service.NotesService;

import java.util.List;


@RestController
@RequestMapping("notes")
public class NotesController {
    private final NotesService notesService;


    @Autowired
    public NotesController(NotesService notesService) {
        this.notesService = notesService;
    }

    @GetMapping
    public List<NotesDTO> getNotes() {
        return notesService.getNotes();
    }
}
