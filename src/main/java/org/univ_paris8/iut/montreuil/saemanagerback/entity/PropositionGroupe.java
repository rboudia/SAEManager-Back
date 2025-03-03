package org.univ_paris8.iut.montreuil.saemanagerback.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "propositionsgroupe")
public class PropositionGroupe {

    @Id
    @GeneratedValue
    @Column(name = "idproposition")
    private Integer idProposition;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idsae", referencedColumnName = "idsae")
    private Sae sae;

    @Column(name = "nom")
    private String nom;

    @Column(name = "edit")
    private Integer edit;


    public Integer getIdProposition() {
        return idProposition;
    }

    public void setIdProposition(Integer idProposition) {
        this.idProposition = idProposition;
    }

    public Sae getSae() {
        return sae;
    }

    public void setSae(Sae sae) {
        this.sae = sae;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getEdit() {
        return edit;
    }

    public void setEdit(Integer edit) {
        this.edit = edit;
    }
}
