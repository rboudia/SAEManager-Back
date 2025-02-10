package org.univ_paris8.iut.montreuil.saemanagerback.dto;

import org.univ_paris8.iut.montreuil.saemanagerback.entity.Evaluation;
import org.univ_paris8.iut.montreuil.saemanagerback.entity.PersonneEntity;
import org.univ_paris8.iut.montreuil.saemanagerback.entity.Sae;

import java.util.Date;

public class EvaluationDTO {

    private Integer idEval;
    private String nom;
    private Double coef;
    private PersonneEntity IntervenantEvaluateur;

    public EvaluationDTO(Integer idEval, String nom, Double coef, PersonneEntity intervenantEvaluateur) {
        this.idEval = idEval;
        this.nom = nom;
        this.coef = coef;
        IntervenantEvaluateur = intervenantEvaluateur;
    }

    public Integer getIdEval() {
        return idEval;
    }

    public void setIdEval(Integer idEval) {
        this.idEval = idEval;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Double getCoef() {
        return coef;
    }

    public void setCoef(Double coef) {
        this.coef = coef;
    }

    public PersonneEntity getIntervenantEvaluateur() {
        return IntervenantEvaluateur;
    }

    public void setIntervenantEvaluateur(PersonneEntity intervenantEvaluateur) {
        IntervenantEvaluateur = intervenantEvaluateur;
    }
}
