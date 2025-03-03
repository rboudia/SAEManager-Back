package org.univ_paris8.iut.montreuil.saemanagerback.dto;

import org.univ_paris8.iut.montreuil.saemanagerback.entity.ResponsablesSae;

import java.util.List;

public class SaeDTO {
    private int idSae;

    private String nomSae;

    private String anneeUniversitaire;

    private Integer semestreUniversitaire;

    private String sujet;

    private String dateModificationSujet;

    //private ResponsablesSae responsablesSae;
    private Integer idResponsable;

    private List<ResponsablesSaeDTO> listeResponsablesSaeDto;


    public SaeDTO () {

    }


    public SaeDTO(int idSae ,String nomSae, String anneeUniversitaire, Integer semestreUniversitaire, String sujet, String dateModificationSujet, Integer idResponsable,List<ResponsablesSaeDTO> listeResponsablesSaeDto /*ResponsablesSae responsablesSae*/) {
        this.idSae = idSae;
        this.nomSae = nomSae ;
        this.anneeUniversitaire = anneeUniversitaire ;
        this.semestreUniversitaire = semestreUniversitaire ;
        this.sujet = sujet ;
        this.dateModificationSujet = dateModificationSujet;
        //this.responsablesSae = responsablesSae;
        this.idResponsable = idResponsable;
        this.listeResponsablesSaeDto = listeResponsablesSaeDto;

    }

    public int getIdSae() {
        return idSae;
    }


    public String getNomSae() {
        return nomSae;
    }

    public void setNomSae(String nomSae) {
        this.nomSae = nomSae;
    }

    public String getAnneeUniversitaire() {
        return anneeUniversitaire;
    }

    public void setAnneeUniversitaire(String anneeUniversitaire) {
        this.anneeUniversitaire = anneeUniversitaire;
    }

    public Integer getSemestreUniversitaire() {
        return semestreUniversitaire;
    }

    public void setSemestreUniversitaire(Integer semestreUniversitaire) {
        this.semestreUniversitaire = semestreUniversitaire;
    }

    public String getSujet() {
        return sujet;
    }

    public void setSujet(String sujet) {
        this.sujet = sujet;
    }

    public String getDateModificationSujet() {
        return dateModificationSujet;
    }

    public void setDateModificationSujet(String dateModificationSujet) {
        this.dateModificationSujet = dateModificationSujet;
    }

    /*
    public ResponsablesSae getResponsablesSae() {
        return responsablesSae;
    }

    public void setResponsablesSae(ResponsablesSae responsablesSae) {
        this.responsablesSae = responsablesSae;
    }
     */

    public List<ResponsablesSaeDTO> getListeResponsablesSaeDto() {
        return listeResponsablesSaeDto;
    }

    public void setListeResponsablesSaeDto(List<ResponsablesSaeDTO> listeResponsablesSaeDto) {
        this.listeResponsablesSaeDto = listeResponsablesSaeDto;
    }

    public Integer getIdResponsable() {
        return idResponsable;
    }

    public void setIdResponsable(Integer idResponsable) {
        this.idResponsable = idResponsable;
    }
}
