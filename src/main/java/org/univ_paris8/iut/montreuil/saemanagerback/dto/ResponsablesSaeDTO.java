package org.univ_paris8.iut.montreuil.saemanagerback.dto;

import org.univ_paris8.iut.montreuil.saemanagerback.entity.Sae;

public class ResponsablesSaeDTO {

    private Integer idResp;
    private Integer idSae;


    public ResponsablesSaeDTO( Integer idResp, Integer idSae) {

        this.idResp = idResp;
        this.idSae = idSae;

    }

    public Integer getIdResp() {
        return idResp;
    }

    public void setIdResp(Integer idResp) {
        this.idResp = idResp;
    }

    public Integer getIdSae() {
        return idSae;
    }

    public void setIdSae(Integer idSae) {
        this.idSae = idSae;
    }
}
