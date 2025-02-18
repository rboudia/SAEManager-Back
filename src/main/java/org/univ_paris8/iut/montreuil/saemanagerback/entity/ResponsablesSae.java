package org.univ_paris8.iut.montreuil.saemanagerback.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "responsablessae")
public class ResponsablesSae {

    @EmbeddedId
    private ResponsablesSaeId id;


    @ManyToOne
    @MapsId("idSae") // Associe idsae de ResponsablesSaeId avec l'entité Sae
    @JoinColumn(name = "idSAE")
    private Sae sae;


    @ManyToOne
    @MapsId("idResp") // Associe idResp de ResponsablesSaeId avec l'entité PersonneEntity
    @JoinColumn(name = "idResp")
    private PersonneEntity responsable;

    public ResponsablesSae() {}

    public ResponsablesSae(Sae sae, PersonneEntity responsable) {
        this.id = new ResponsablesSaeId(sae.getIdSAE(), responsable.getIdPersonne());
        this.sae = sae;
        this.responsable = responsable;
    }

    public ResponsablesSaeId getId() {
        return id;
    }

    public void setId(ResponsablesSaeId id) {
        this.id = id;
    }

    public Sae getSae() {
        return sae;
    }

    public void setSae(Sae sae) {
        this.sae = sae;
    }

    public PersonneEntity getResponsable() {
        return responsable;
    }

    public void setResponsable(PersonneEntity responsable) {
        this.responsable = responsable;
    }

    public Integer getIdSae() {
        return sae != null ? sae.getIdSAE() : null;
    }

    public Integer getIdResponsable() {
        return responsable != null ? responsable.getIdPersonne() : null;
    }

}

