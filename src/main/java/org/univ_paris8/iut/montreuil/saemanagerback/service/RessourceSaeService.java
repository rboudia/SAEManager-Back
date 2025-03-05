package org.univ_paris8.iut.montreuil.saemanagerback.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.univ_paris8.iut.montreuil.saemanagerback.dto.RessourceSaeDTO;
import org.univ_paris8.iut.montreuil.saemanagerback.entity.RessourceSAE;
import org.univ_paris8.iut.montreuil.saemanagerback.entity.composite.RessourceSaeId;
import org.univ_paris8.iut.montreuil.saemanagerback.mapper.RessourceSaeMapper;
import org.univ_paris8.iut.montreuil.saemanagerback.repository.RessourceSaeRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RessourceSaeService {

    private final RessourceSaeRepository ressourceSaeRepository;
    private final RessourceSaeMapper ressourceSaeMapper;

    @Autowired
    public RessourceSaeService(RessourceSaeRepository ressourceSaeRepository) {
        this.ressourceSaeRepository = ressourceSaeRepository;
        this.ressourceSaeMapper = new RessourceSaeMapper();
    }

    public List<RessourceSaeDTO> getAllRessourcessae() {
        System.out.println("dans le service");
        return ressourceSaeRepository.findAll()
                .stream()
                .map(ressourceSaeMapper::toDTO)
                .collect(Collectors.toList());
    }

    public RessourceSAE createRessourceSae(RessourceSaeDTO dto) {
        RessourceSAE ressourceSae = new RessourceSAE(dto.getIdSAE(), dto.getiDRessource(), dto.getMisEnAvant());
        return ressourceSaeRepository.save(ressourceSae);
    }

    @Transactional
    public void deleteRessourceSae(Integer idSae, Integer idRessource) {
        RessourceSaeId ressourceSaeId = new RessourceSaeId(idSae, idRessource);

        if (!ressourceSaeRepository.existsById(ressourceSaeId)) {
            throw new IllegalArgumentException("RessourceSAE non trouvée !");
        }

        ressourceSaeRepository.deleteById(ressourceSaeId);
    }

    public List<RessourceSaeDTO> getRessourcesBySae(Integer idSae) {
        return ressourceSaeRepository.findById_IdSae(idSae)
                .stream()
                .map(ressourceSaeMapper::toDTO)
                .collect(Collectors.toList());
    }


}
