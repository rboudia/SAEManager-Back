package org.univ_paris8.iut.montreuil.saemanagerback.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.univ_paris8.iut.montreuil.saemanagerback.entity.Personne;
import org.univ_paris8.iut.montreuil.saemanagerback.repository.PersonneRepository;

import java.util.List;

@Service
public class PersonneService {

    private final PersonneRepository personneRepository;

    @Autowired
    public PersonneService(PersonneRepository personneRepository) {
        this.personneRepository = personneRepository;
    }

    public List<Personne> getPersonnes() {
        return personneRepository.findAll();
    }
}
