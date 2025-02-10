package org.univ_paris8.iut.montreuil.saemanagerback.entity;

import jakarta.persistence.*;
import jdk.jfr.Enabled;

import java.util.Date;

@Enabled
@Table(name = "rendu")
public class Rendu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idRendu")
    private int idRendu;

    @Column(name = "nom")
    private String nom;

    @Column(name = "dateLimite")
    private Date coef;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idSAE", referencedColumnName = "idSAE")
    private Sae idSAE;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idEvaluation", referencedColumnName = "idEval")
    private Evaluation idEvaluation;

    public Rendu() {}

    public int getIdRendu() {
        return idRendu;
    }

    public void setIdRendu(int idRendu) {
        this.idRendu = idRendu;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getCoef() {
        return coef;
    }

    public void setCoef(Date coef) {
        this.coef = coef;
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


