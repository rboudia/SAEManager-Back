package org.univ_paris8.iut.montreuil.saemanagerback.entity;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "ressource")
public class Ressource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idRessource")
    private int idRessource;

    @Column(name = "contenu")
    private String contenu;

    @Column(name = "couleur")
    private String couleur;

    @Column(name = "nom")
    private String nom;

    public int getIdRessource() {
        return idRessource;
    }

    public void setIdRessource(int idRessource) {
        this.idRessource = idRessource;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


}


