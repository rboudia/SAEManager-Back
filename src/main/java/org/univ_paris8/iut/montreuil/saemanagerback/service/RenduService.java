package org.univ_paris8.iut.montreuil.saemanagerback.service;

import org.springframework.stereotype.Service;
import org.univ_paris8.iut.montreuil.saemanagerback.dto.RenduDTO;
import org.univ_paris8.iut.montreuil.saemanagerback.entity.Evaluation;
import org.univ_paris8.iut.montreuil.saemanagerback.entity.Rendu;
import org.univ_paris8.iut.montreuil.saemanagerback.mapper.EvaluationMapper;
import org.univ_paris8.iut.montreuil.saemanagerback.mapper.RenduMapper;
import org.univ_paris8.iut.montreuil.saemanagerback.repository.EvaluationRepository;
import org.univ_paris8.iut.montreuil.saemanagerback.repository.RenduRepository;

@Service
public class RenduService {
    private final RenduRepository renduRepository;
    private final EvaluationRepository evaluationRepository;

    private final RenduMapper renduMapper;
    private final EvaluationMapper evaluationMapper;


    public RenduService(RenduRepository renduRepository, EvaluationRepository evaluationRepository) {
        this.renduRepository = renduRepository;
        this.evaluationRepository = evaluationRepository;

        this.renduMapper = new RenduMapper();
        this.evaluationMapper = new EvaluationMapper();
    }

    public void createRendu(RenduDTO renduDTO) {
        Rendu rendu = this.renduMapper.toEntity(renduDTO);

        if (renduDTO.getEvaluation() != null) {
            Evaluation evaluation = this.evaluationMapper.toEntity(renduDTO.getEvaluation());

            evaluation.setNom(renduDTO.getNom());

            this.evaluationRepository.save(evaluation);

            rendu.setEvaluation(evaluation);
        }

        this.renduRepository.save(rendu);
    }
}
