package org.univ_paris8.iut.montreuil.saemanagerback.entity;

import java.io.Serializable;
import java.util.Objects;

public class ResponsablesSaeId implements Serializable {
    private int sae;
    private int responsable;

    public ResponsablesSaeId() {}

    public ResponsablesSaeId(int sae, int responsable) {
        this.sae = sae;
        this.responsable = responsable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResponsablesSaeId that = (ResponsablesSaeId) o;
        return Objects.equals(sae, that.sae) &&
                Objects.equals(responsable, that.responsable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sae, responsable);
    }



}
