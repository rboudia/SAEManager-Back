package org.univ_paris8.iut.montreuil.saemanagerback.mapper;

import org.springframework.stereotype.Component;
import org.univ_paris8.iut.montreuil.saemanagerback.dto.GroupeDTO;
import org.univ_paris8.iut.montreuil.saemanagerback.entity.Groupe;
import org.univ_paris8.iut.montreuil.saemanagerback.entity.Sae;
import org.univ_paris8.iut.montreuil.saemanagerback.repository.SaeRepository;

import java.util.ArrayList;

@Component
public class GroupeMapper extends BaseMapper<Groupe, GroupeDTO> {

    private final SaeRepository saeRepository;

    public GroupeMapper(SaeRepository saeRepository) {
        this.saeRepository = saeRepository;
    }

    @Override
    public GroupeDTO toDTO(Groupe entity) {

        GroupeDTO dto = new GroupeDTO(
                entity.getNom(),
                entity.getImageTitre(),
                entity.getSae().getIdSAE(),
                entity.getEstModifiableParEleve(),
                new ArrayList<>()
        );

        return dto;
    }

    @Override
    public Groupe toEntity(GroupeDTO dto) {
        Groupe entity = new Groupe();
        entity.setNom(dto.getNom());

        if (dto.getImageTitre() != null) {
            entity.setImageTitre(dto.getImageTitre());
        }

        Sae sae = saeRepository.findById(dto.getIdSae()).get();
        entity.setSae(sae);

        entity.setEstModifiableParEleve(dto.getEstModifiableParEleve());

        return entity;
    }
}
