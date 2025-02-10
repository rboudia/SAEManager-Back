package org.univ_paris8.iut.montreuil.saemanagerback.dto;

import org.univ_paris8.iut.montreuil.saemanagerback.entity.Evaluation;
import org.univ_paris8.iut.montreuil.saemanagerback.entity.Sae;

import javax.xml.crypto.Data;
import java.util.Date;

public class RenduDTO {

    private Integer idRendu;
    private String nom;
    private Date dateLimite;
    private Sae idSAE;
    private Evaluation idEvaluation;

    public RenduDTO(Integer idRendu, String nom, Date dateLimite, Sae idSAE, Evaluation idEvaluation) {
        this.idRendu = idRendu;
        this.nom = nom;
        this.dateLimite = dateLimite;
        this.idSAE = idSAE;
        this.idEvaluation = idEvaluation;
    }

    public Integer getIdRendu() {
        return idRendu;
    }

    public void setIdRendu(Integer idRendu) {
        this.idRendu = idRendu;
    }

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

    public Sae getIdSAE() {
        return idSAE;
    }

    public void setIdSAE(Sae idSAE) {
        this.idSAE = idSAE;
    }

    public Evaluation getIdEvaluation() {
        return idEvaluation;
    }

    public void setIdEvaluation(Evaluation idEvaluation) {
        this.idEvaluation = idEvaluation;
    }

}
