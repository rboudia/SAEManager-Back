package org.univ_paris8.iut.montreuil.saemanagerback.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "responsablesSae")
public class ResponsablesSae {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idResp")
    private int idResponsable;

    @OneToOne
    @JoinColumn(name = "idSAE", referencedColumnName = "idSAE")
    private Sae sae ;


    public ResponsablesSae() {

    }

    public int getIdResponsable() {
        return idResponsable;
    }

    public void setIdResponsable(int idResponsable) {
        this.idResponsable = idResponsable;
    }

    public Sae getSae() {
        return sae;
    }

    public void setSae(Sae sae) {
        this.sae = sae;
    }


}
