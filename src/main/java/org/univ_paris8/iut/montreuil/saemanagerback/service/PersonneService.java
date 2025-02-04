package org.univ_paris8.iut.montreuil.saemanagerback.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.univ_paris8.iut.montreuil.saemanagerback.dto.PersonneDTO;
import org.univ_paris8.iut.montreuil.saemanagerback.mapper.PersonneMapper;
import org.univ_paris8.iut.montreuil.saemanagerback.repository.PersonneRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonneService {

    private final PersonneRepository personneRepository;
    private final PersonneMapper personneMapper;

    @Autowired
    public PersonneService(PersonneRepository personneRepository) {
        this.personneRepository = personneRepository;
        this.personneMapper = new PersonneMapper();
    }

    public List<PersonneDTO> getPersonnes() {
        return personneRepository.findAll()
                .stream()
                .map(personneMapper::toDTO)
                .collect(Collectors.toList());
    }

    public List<PersonneDTO> getPersonnesByEstProf(Integer estProf) {
        return personneRepository.findByEstProf(estProf)
                .stream()
                .map(personneMapper::toDTO)
                .collect(Collectors.toList());
    }
}
