package org.univ_paris8.iut.montreuil.saemanagerback.dto;

import org.univ_paris8.iut.montreuil.saemanagerback.entity.Sae;

public class PropositionGroupeDTO {

    private Integer idProsition;
    private Sae sae;
    private String nom;
    private Integer edit;

    public PropositionGroupeDTO(Integer idProsition, Sae sae, String nom, Integer edit) {
        this.idProsition = idProsition;
        this.sae = sae;
        this.nom = nom;
        this.edit = edit;
    }

    public Integer getIdProsition() {
        return idProsition;
    }

    public void setIdProsition(Integer idProsition) {
        this.idProsition = idProsition;
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
