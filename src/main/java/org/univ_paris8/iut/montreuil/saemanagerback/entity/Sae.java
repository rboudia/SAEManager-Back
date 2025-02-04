package org.univ_paris8.iut.montreuil.saemanagerback.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "sae")
public class Sae {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idsae")
    private int idSAE;

    @Column(name = "nomsae")
    private String nomSae;

    @Column(name = "anneeuniversitaire")
    private String anneeUniversitaire;

    @Column(name = "semestreuniversitaire")
    private int semestreUniversitaire;

    @Column(name = "sujet")
    private String sujet;

    @Column(name = "datemodificationsujet")
    private String dateModificationSujet;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idresp", referencedColumnName = "idResp")
    private ResponsablesSae responsablesSae;


    public Sae() {

    }

    public int getIdSAE() {
        return idSAE;
    }

    public void setIdSAE(int idSAE) {
        this.idSAE = idSAE;
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

    public int getSemestreUniversitaire() {
        return semestreUniversitaire;
    }

    public void setSemestreUniversitaire(int semestreUniversitaire) {
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

    public ResponsablesSae getResponsable() {
        return responsablesSae;
    }

    public void setResponsable(ResponsablesSae responsablesSae) {
        this.responsablesSae = responsablesSae;
    }
}
