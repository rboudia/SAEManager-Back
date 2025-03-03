package org.univ_paris8.iut.montreuil.saemanagerback.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.univ_paris8.iut.montreuil.saemanagerback.dto.PersonneDTO;
import org.univ_paris8.iut.montreuil.saemanagerback.dto.SaeDTO;
import org.univ_paris8.iut.montreuil.saemanagerback.entity.PersonneEntity;
import org.univ_paris8.iut.montreuil.saemanagerback.entity.ResponsablesSae;
import org.univ_paris8.iut.montreuil.saemanagerback.entity.Sae;
import org.univ_paris8.iut.montreuil.saemanagerback.mapper.SaeMapper;
import org.univ_paris8.iut.montreuil.saemanagerback.repository.PersonneRepository;
import org.univ_paris8.iut.montreuil.saemanagerback.repository.ResponsableSaeRepository;
import org.univ_paris8.iut.montreuil.saemanagerback.repository.SaeRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SaeService {

    private final SaeRepository saeRepository;
    private final ResponsableSaeRepository responsableSaeRepository;
    private final SaeMapper saeMapper;
    private final PersonneRepository personneRepository;




    @Autowired
    public SaeService(SaeRepository saeRepository, ResponsableSaeRepository responsableSaeRepository, SaeMapper saeMapper, PersonneRepository personneRepository) {
        this.saeRepository = saeRepository;
        this.responsableSaeRepository = responsableSaeRepository;
        this.saeMapper = saeMapper;
        this.personneRepository = personneRepository;
    }

    /*
    public SaeDTO createSae(SaeDTO saeDTO) {
        // 1. Convertir DTO en entité SAE (sans l'ID)
        Sae sae = new Sae();
        sae.setNomSae(saeDTO.getNomSae());
        sae.setAnneeUniversitaire(saeDTO.getAnneeUniversitaire());
        sae.setSemestreUniversitaire(saeDTO.getSemestreUniversitaire());
        sae.setSujet(saeDTO.getSujet());
        sae.setDateModificationSujet(saeDTO.getDateModificationSujet());

        // 2. Sauvegarder la SAE pour générer l'ID
        final Sae savedSae = saeRepository.save(sae);

        // 3. Associer les responsables après avoir récupéré l'ID
        List<ResponsablesSae> responsables = saeDTO.getListeResponsablesSaeDto().stream().map(dto -> {
            PersonneEntity responsable = personneRepository.findById(dto.getIdResp())
                    .orElseThrow(() -> new RuntimeException("Responsable non trouvé avec ID: " + dto.getIdResp()));
            return new ResponsablesSae(sae, responsable);
        }).collect(Collectors.toList());

        responsableSaeRepository.saveAll(responsables);

        // 4. Retourner le DTO mis à jour
        return saeMapper.toDto(savedSae);
    }
    */

    public SaeDTO createSae(SaeDTO saeDTO) {

        if (saeDTO.getIdResponsable() == null) {
            throw new IllegalArgumentException("L'ID du responsable ne peut pas être null.");
        }

        PersonneEntity createur = personneRepository.findById(saeDTO.getIdResponsable())
                .orElseThrow(() -> new RuntimeException("Créateur non trouvé avec ID: " + saeDTO.getIdResponsable()));

        Sae sae = new Sae();
        sae.setNomSae(saeDTO.getNomSae());
        sae.setAnneeUniversitaire(saeDTO.getAnneeUniversitaire());
        sae.setSemestreUniversitaire(saeDTO.getSemestreUniversitaire());
        sae.setSujet(saeDTO.getSujet());
        sae.setDateModificationSujet(saeDTO.getDateModificationSujet());
        sae.setCreateur(createur); // Associe le créateur

        sae = saeRepository.save(sae);

        return saeMapper.toDto(sae);
    }

    public List<SaeDTO> getAllSaes() {
        return saeRepository.findAll()
                .stream()
                .map(sae -> saeMapper.toDto(sae))
                .collect(Collectors.toList());

    }

    public SaeDTO getSae(int id) {
        return saeRepository.findById(id)
                .map(sae-> saeMapper.toDto(sae))
                .orElse(null);
    }





}
