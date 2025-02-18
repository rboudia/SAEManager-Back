package org.univ_paris8.iut.montreuil.saemanagerback.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "groupe")
public class Groupe {

    @Id
    @GeneratedValue
    @Column(name = "idgroupe")
    private Integer idGroupe;

    @Column(name = "nom")
    private String nom;

    @Column(name = "imagetitre")
    private String imageTitre;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idsae", referencedColumnName = "idsae")
    private Sae sae;

    @Column(name = "estmodifiablepareleve")
    private Integer estModifiableParEleve;


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
