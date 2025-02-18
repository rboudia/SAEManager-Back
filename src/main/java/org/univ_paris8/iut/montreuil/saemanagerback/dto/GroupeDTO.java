package org.univ_paris8.iut.montreuil.saemanagerback.dto;

import org.univ_paris8.iut.montreuil.saemanagerback.entity.Sae;

public class GroupeDTO {
    private Integer idGroupe;
    private String nom;
    private String imageTitre;
    private Sae sae;
    private Integer estModifiableParEleve;

    public GroupeDTO(Integer idGroupe, String nom, String imageTitre, Sae sae, Integer estModifiableParEleve) {
        this.idGroupe = idGroupe;
        this.nom = nom;
        this.imageTitre = imageTitre;
        this.sae = sae;
        this.estModifiableParEleve = estModifiableParEleve;
    }

    public Integer getIdGroupe() {
        return idGroupe;
    }

    public void setIdGroupe(Integer idGroupe) {
        this.idGroupe = idGroupe;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getImageTitre() {
        return imageTitre;
    }

    public void setImageTitre(String imageTitre) {
        this.imageTitre = imageTitre;
    }

    public Sae getSae() {
        return sae;
    }

    public void setSae(Sae sae) {
        this.sae = sae;
    }

    public Integer getEstModifiableParEleve() {
        return estModifiableParEleve;
    }

    public void setEstModifiableParEleve(Integer estModifiableParEleve) {
        this.estModifiableParEleve = estModifiableParEleve;
    }
}
