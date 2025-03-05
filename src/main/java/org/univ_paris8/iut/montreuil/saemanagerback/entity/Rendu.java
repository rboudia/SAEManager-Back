package org.univ_paris8.iut.montreuil.saemanagerback.entity;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import jdk.jfr.Enabled;

import java.util.Date;

@Entity
@Table(name = "rendu")
public class Rendu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idRendu")
    private int idRendu;

    @Column(name = "nom")
    private String nom;

    @Column(name = "dateLimite")
    private Date dateLimite;

    @ManyToOne
    @JoinColumn(name = "idSAE", referencedColumnName = "idSAE")
    private Sae sae;

    @ManyToOne
    @JoinColumn(name = "idEvaluation", referencedColumnName = "idEval")
    private Evaluation evaluation;

    public Rendu() {
    }

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

    public Evaluation getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(Evaluation evaluation) {
        this.evaluation = evaluation;
    }
}


