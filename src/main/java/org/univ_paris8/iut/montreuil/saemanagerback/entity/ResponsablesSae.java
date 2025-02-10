package org.univ_paris8.iut.montreuil.saemanagerback.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "responsablessae")
public class ResponsablesSae {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idresp")
    private int idResp;

    @ManyToOne
    @JoinColumn(name = "idsae", referencedColumnName = "idsae")
    private Sae sae ;


    public ResponsablesSae() {

    }

    public int getIdResp() {
        return idResp;
    }

    public void setIdResp(int idResponsable) {
        this.idResp = idResponsable;
    }

    public Sae getSae() {
        return sae;
    }

    public void setSae(Sae sae) {
        this.sae = sae;
    }


}
