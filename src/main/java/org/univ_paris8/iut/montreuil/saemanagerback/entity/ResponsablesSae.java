package org.univ_paris8.iut.montreuil.saemanagerback.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "responsablessae")
@IdClass(ResponsablesSaeId.class)
public class ResponsablesSae {

    @Id
    @ManyToOne
    @JoinColumn(name = "idSAE", nullable = false)
    private Sae sae;

    @Id
    @ManyToOne
    @JoinColumn(name = "idResp", nullable = false)
    private PersonneEntity responsable;

    public ResponsablesSae() {}

    public ResponsablesSae(Sae sae, PersonneEntity responsable) {
        this.sae = sae;
        this.responsable = responsable;
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

