package org.univ_paris8.iut.montreuil.saemanagerback.dto;

import org.univ_paris8.iut.montreuil.saemanagerback.entity.Sae;

public class ResponsablesSaeDTO {

    private Integer idResp;

    private Sae sae;


    public ResponsablesSaeDTO(Integer idResp, Sae sae) {

        this.idResp = idResp;
        this.sae = sae;

    }

    public Integer getIdResp() {
        return idResp;
    }

    public void setIdResp(Integer idResp) {
        this.idResp = idResp;
    }

    public Sae getSae() {
        return sae;
    }

    public void setSae(Sae sae) {
        this.sae = sae;
    }


}
