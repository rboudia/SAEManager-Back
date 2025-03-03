package org.univ_paris8.iut.montreuil.saemanagerback.dto;

public class RessourceDTO {
    private Integer idRessource;
    private String contenu;
    private String couleur;
    private String nom;

    public RessourceDTO(Integer idRessource, String contenu, String couleur, String nom) {
        this.idRessource = idRessource;
        this.contenu = contenu;
        this.couleur = couleur;
        this.nom = nom;
    }

    public Integer getIdRessource() {
        return idRessource;
    }

    public void setIdRessource(Integer idRessource) {
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

