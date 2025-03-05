package org.univ_paris8.iut.montreuil.saemanagerback.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.univ_paris8.iut.montreuil.saemanagerback.dto.EvaluationDTO;
import org.univ_paris8.iut.montreuil.saemanagerback.entity.Evaluation;
import org.univ_paris8.iut.montreuil.saemanagerback.repository.EvaluationRepository;

import java.util.List;

@Service
public class EvaluationService {

    private final EvaluationRepository evaluationRepository;
    //private final EvaluationMapper personneMapper;

    @Autowired
    public EvaluationService(EvaluationRepository evaluationRepository) {
        this.evaluationRepository = evaluationRepository;
        //this.personneMapper = new PersonneMapper();
    }

    public List<Evaluation> getEvaluations() {
        return evaluationRepository.findAll();
    }
}
