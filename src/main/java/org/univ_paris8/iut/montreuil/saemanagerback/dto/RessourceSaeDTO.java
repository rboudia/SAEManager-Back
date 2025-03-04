package org.univ_paris8.iut.montreuil.saemanagerback.dto;


public class RessourceSaeDTO {
    private Integer idSAE;
    private Integer iDRessource;
    private Integer misEnAvant;

    public RessourceSaeDTO(Integer idSAE, Integer iDRessource, Integer misEnAvant) {
        this.idSAE = idSAE;
        this.iDRessource = iDRessource;
        this.misEnAvant = misEnAvant;
    }

    public Integer getIdSAE() {
        return idSAE;
    }

    public void setIdSAE(Integer idSAE) {
        this.idSAE = idSAE;
    }

    public Integer getiDRessource() {
        return iDRessource;
    }

    public void setiDRessource(Integer iDRessource) {
        this.iDRessource = iDRessource;
    }

    public Integer getMisEnAvant() {
        return misEnAvant;
    }

    public void setMisEnAvant(Integer misEnAvant) {
        this.misEnAvant = misEnAvant;
    }
}
