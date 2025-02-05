package org.univ_paris8.iut.montreuil.saemanagerback.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.univ_paris8.iut.montreuil.saemanagerback.dto.PersonneDTO;
import org.univ_paris8.iut.montreuil.saemanagerback.entity.PersonneEntity;
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

    @Transactional(rollbackFor = Exception.class)
    public String updateEstProf(Integer estProf, List<Integer> idsPersonne) throws Exception {
        for (Integer idPersonne : idsPersonne) {
            if (personneExiste(idPersonne)) {
                personneRepository.updateEstProf(estProf, idPersonne);
            } else {
                throw new Exception("La personne avec cette id n'existe pas : " + idPersonne);
            }
        }

        return "Les personnes avec les ids suivant ont bien été modifiées : " + idsPersonne.toString();
    }

    private boolean personneExiste(Integer idPersonne) {
        return personneRepository.existsById(idPersonne);
    }

    public PersonneDTO addPersonne(PersonneDTO personneDTO) {
        PersonneEntity personneEntity = personneMapper.toEntity(personneDTO);
        personneEntity.setEstAdmin(null);
        personneEntity.setEstProf(0);
        personneEntity.setPhotoDeProfil(null);
        personneEntity.setLogin(personneEntity.getPrenom() + "." + personneEntity.getNom());
        return personneMapper.toDTO(personneRepository.save(personneEntity));
    }
}
