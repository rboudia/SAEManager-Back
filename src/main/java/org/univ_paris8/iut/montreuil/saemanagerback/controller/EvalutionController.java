package org.univ_paris8.iut.montreuil.saemanagerback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.univ_paris8.iut.montreuil.saemanagerback.entity.Evaluation;
import org.univ_paris8.iut.montreuil.saemanagerback.service.EvaluationService;

import java.util.List;

@RestController
@RequestMapping("evaluation")
public class EvalutionController {

    private final EvaluationService evaluationService;

    @Autowired
    public EvalutionController(EvaluationService evaluationService) {
        this.evaluationService = evaluationService;
    }

    @GetMapping
    public List<Evaluation> getPersonnes() {
        return evaluationService.getEvaluations();
    }
}
