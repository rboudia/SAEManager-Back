package org.univ_paris8.iut.montreuil.saemanagerback.entity.composite;

import java.io.Serializable;
import java.util.Objects;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class RessourceSaeId implements Serializable {

    @Column(name = "idSae")
    private Integer idSae;

    @Column(name = "idRessource")
    private Integer idRessource;


    public RessourceSaeId() {}

    public RessourceSaeId(Integer idSae, Integer idRessource) {
        this.idSae = idSae;
        this.idRessource = idRessource;
    }

    public Integer getIdSae() {
        return idSae;
    }

    public void setIdSae(Integer idSae) {
        this.idSae = idSae;
    }

    public Integer getIdRessource() {
        return idRessource;
    }

    public void setIdRessource(Integer idRessource) {
        this.idRessource = idRessource;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RessourceSaeId that = (RessourceSaeId) o;
        return Objects.equals(idSae, that.idSae) &&
                Objects.equals(idRessource, that.idRessource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSae, idRessource);
    }
}
