package org.univ_paris8.iut.montreuil.saemanagerback.mapper;

import org.univ_paris8.iut.montreuil.saemanagerback.dto.EvaluationDTO;
import org.univ_paris8.iut.montreuil.saemanagerback.entity.Evaluation;

public class EvaluationMapper extends BaseMapper<Evaluation, EvaluationDTO> {
    @Override
    public EvaluationDTO toDTO(Evaluation entity) {
        EvaluationDTO dto = new EvaluationDTO(
                entity.getIdEval(),
                entity.getNom(),
                entity.getCoef(),
                entity.getIntervenantEvaluateur()
        );

        return dto;
    }

    @Override
    public Evaluation toEntity(EvaluationDTO dto) {
        Evaluation entity = new Evaluation();


        entity.setIdEval(dto.getIdEval());
        entity.setNom(dto.getNom());
        entity.setCoef(dto.getCoef());
        entity.setIntervenantEvaluateur(dto.getIntervenantEvaluateur());

        return entity;
    }

}
