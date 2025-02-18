package org.univ_paris8.iut.montreuil.saemanagerback.entity;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ResponsablesSaeId implements Serializable {
    private int idSae;
    private int idResp;

    public ResponsablesSaeId() {}

    public ResponsablesSaeId(int idSae, int idResp) {
        this.idSae = idSae;
        this.idResp = idResp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResponsablesSaeId that = (ResponsablesSaeId) o;
        return Objects.equals(idSae, that.idSae) &&
                Objects.equals(idResp, that.idResp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSae, idResp);
    }

    public int getIdSae() {
        return idSae;
    }

    public void setIdSae(int idSae) {
        this.idSae = idSae;
    }

    public int getIdResp() {
        return idResp;
    }

    public void setIdResp(int idResp) {
        this.idResp = idResp;
    }


}
