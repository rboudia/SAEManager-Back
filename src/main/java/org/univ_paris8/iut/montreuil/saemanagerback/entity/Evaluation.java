package org.univ_paris8.iut.montreuil.saemanagerback.entity;

import jakarta.persistence.*;
import jdk.jfr.Enabled;

@Enabled
@Table(name = "evaluation")
public class Evaluation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEval")
    private int idEval;

    @Column(name = "nom")
    private String nom;

    @Column(name = "coef")
    private double coef;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "IntervenantEvaluateur", referencedColumnName = "idPersonne")
    private PersonneEntity intervenantEvaluateur;

    public Evaluation() {}

    public int getIdEval() {
        return idEval;
    }

    public void setIdEval(int idEval) {
        this.idEval = idEval;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getCoef() {
        return coef;
    }

    public void setCoef(double coef) {
        this.coef = coef;
    }

    public PersonneEntity getIntervenantEvaluateur() {
        return intervenantEvaluateur;
    }

    public void setIntervenantEvaluateur(PersonneEntity intervenantEvaluateur) {
        this.intervenantEvaluateur = intervenantEvaluateur;
    }
}


