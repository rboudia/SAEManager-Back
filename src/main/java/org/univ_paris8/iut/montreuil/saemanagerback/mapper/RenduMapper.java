package org.univ_paris8.iut.montreuil.saemanagerback.mapper;

import org.univ_paris8.iut.montreuil.saemanagerback.dto.RenduDTO;
import org.univ_paris8.iut.montreuil.saemanagerback.entity.Rendu;

public class RenduMapper extends BaseMapper <Rendu, RenduDTO> {

    private final EvaluationMapper evaluationMapper = new EvaluationMapper();

    @Override
    public RenduDTO toDTO(Rendu entity) {
        RenduDTO dto = new RenduDTO(
                entity.getIdRendu(),
                entity.getNom(),
                entity.getDateLimite(),
                entity.getSae(),
                evaluationMapper.toDTO(entity.getEvaluation()));

        return dto;
    }

    @Override
    public Rendu toEntity(RenduDTO dto) {
        Rendu entity = new Rendu();

        //entity.setIdRendu(dto.getIdRendu());
        entity.setNom(dto.getNom());
        entity.setDateLimite(dto.getDateLimite());
        entity.setSae(dto.getSae());
        if (dto.getEvaluation() != null) {
            entity.setEvaluation(evaluationMapper.toEntity(dto.getEvaluation()));

        } else {
            entity.setEvaluation(null);
        }

        return entity;
    }
}
