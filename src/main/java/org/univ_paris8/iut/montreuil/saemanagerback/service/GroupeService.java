package org.univ_paris8.iut.montreuil.saemanagerback.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.univ_paris8.iut.montreuil.saemanagerback.dto.GroupeDTO;
import org.univ_paris8.iut.montreuil.saemanagerback.entity.EtudiantGroupe;
import org.univ_paris8.iut.montreuil.saemanagerback.entity.Groupe;
import org.univ_paris8.iut.montreuil.saemanagerback.entity.PersonneEntity;
import org.univ_paris8.iut.montreuil.saemanagerback.mapper.GroupeMapper;
import org.univ_paris8.iut.montreuil.saemanagerback.repository.EtudiantGroupeRepository;
import org.univ_paris8.iut.montreuil.saemanagerback.repository.GroupeRepository;
import org.univ_paris8.iut.montreuil.saemanagerback.repository.PersonneRepository;


@Service
public class GroupeService {

    private final GroupeRepository groupeRepository;
    private final PersonneRepository personneRepository;
    private final EtudiantGroupeRepository etudiantGroupeRepository;
    private final GroupeMapper groupeMapper;

    @Autowired
    public GroupeService(GroupeRepository groupeRepository, PersonneRepository personneRepository, EtudiantGroupeRepository etudiantGroupeRepository,GroupeMapper groupeMapper) {
        this.groupeRepository = groupeRepository;
        this.personneRepository = personneRepository;
        this.etudiantGroupeRepository = etudiantGroupeRepository;
        this.groupeMapper = groupeMapper;
    }

    @Transactional
    public void createGroupe(GroupeDTO groupeDTO) {
        Groupe groupe = groupeMapper.toEntity(groupeDTO);

        groupe = groupeRepository.save(groupe);

        if (groupeDTO.getIdsEtudiants() != null) {
            for (Integer idEtudiant: groupeDTO.getIdsEtudiants()) {
                PersonneEntity etudiant = personneRepository.findById(idEtudiant).get();

                EtudiantGroupe etudiantGroupe = new EtudiantGroupe(groupe.getIdGroupe(), etudiant.getIdPersonne());

                etudiantGroupeRepository.save(etudiantGroupe);
            }
        }
    }

}
