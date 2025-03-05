package org.univ_paris8.iut.montreuil.saemanagerback.dto;

import org.univ_paris8.iut.montreuil.saemanagerback.entity.Evaluation;
import org.univ_paris8.iut.montreuil.saemanagerback.entity.Sae;

import java.util.Date;

public class RenduDTO {

    //private Integer idRendu;
    private String nom;
    private Date dateLimite;
    private Sae sae;
    private EvaluationDTO evaluation;

    public RenduDTO(Integer idRendu, String nom, Date dateLimite, Sae sae, EvaluationDTO evaluation) {
        //this.idRendu = idRendu;
        this.nom = nom;
        this.dateLimite = dateLimite;
        this.sae = sae;
        this.evaluation = evaluation;
    }
/*
    public Integer getIdRendu() {
        return idRendu;
    }

    public void setIdRendu(Integer idRendu) {
        this.idRendu = idRendu;
    }
*/
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDateLimite() {
        return dateLimite;
    }

    public void setDateLimite(Date dateLimite) {
        this.dateLimite = dateLimite;
    }

    public Sae getSae() {
        return sae;
    }

    public void setSae(Sae sae) {
        this.sae = sae;
    }

    public EvaluationDTO getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(EvaluationDTO evaluation) {
        this.evaluation = evaluation;
    }

}
