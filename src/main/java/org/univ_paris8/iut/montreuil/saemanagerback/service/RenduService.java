package org.univ_paris8.iut.montreuil.saemanagerback.service;

import org.springframework.stereotype.Service;
import org.univ_paris8.iut.montreuil.saemanagerback.dto.RenduDTO;
import org.univ_paris8.iut.montreuil.saemanagerback.entity.Rendu;
import org.univ_paris8.iut.montreuil.saemanagerback.mapper.RenduMapper;
import org.univ_paris8.iut.montreuil.saemanagerback.repository.EvaluationRepository;
import org.univ_paris8.iut.montreuil.saemanagerback.repository.RenduRepository;

@Service
public class RenduService {
    private final RenduRepository renduRepository;
    private final RenduMapper renduMapper;
    private final EvaluationRepository evaluationRepository;

    public RenduService(RenduRepository renduRepository, EvaluationRepository evaluationRepository) {
        this.renduRepository = renduRepository;
        this.renduMapper = new RenduMapper();
        this.evaluationRepository = evaluationRepository;
    }

    public void createRendu(RenduDTO renduDTO) {
        Rendu rendu = this.renduMapper.toEntity(renduDTO);

        this.renduRepository.save(rendu);

        if (renduDTO.getEvaluation() != null) {
            this.evaluationRepository.save(rendu.getEvaluation());
        }
    }
}
