package org.univ_paris8.iut.montreuil.saemanagerback.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.univ_paris8.iut.montreuil.saemanagerback.dto.NotesDTO;
import org.univ_paris8.iut.montreuil.saemanagerback.mapper.NotesMapper;
import org.univ_paris8.iut.montreuil.saemanagerback.repository.NotesRepository;


import java.util.List;
import java.util.stream.Collectors;

@Service
public class NotesService {
    private final NotesRepository notesRepository;
    private final NotesMapper notesMapper;

    @Autowired
    public NotesService(NotesRepository notesRepository) {
        this.notesRepository = notesRepository;
        this.notesMapper = new NotesMapper();
    }

    public List<NotesDTO> getNotes() {
        return notesRepository.findAll()
                .stream()
                .map(notesMapper::toDTO)
                .collect(Collectors.toList());
    }
}
