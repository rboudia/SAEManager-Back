package org.univ_paris8.iut.montreuil.saemanagerback.dto;

public class PersonneDTO {

    private Integer idPersonne;
    private String nom;
    private String prenom;
    private String photoDeProfil;
    private String email;
    //private Integer estProf;
    //private Integer estAdmin


    public PersonneDTO(Integer idPersonne, String nom, String prenom, String photoDeProfil, String email) {
        this.idPersonne = idPersonne;
        this.nom = nom;
        this.prenom = prenom;
        this.photoDeProfil = photoDeProfil;
        this.email = email;
    }

    public Integer getIdPersonne() {
        return idPersonne;
    }

    public void setIdPersonne(Integer idPersonne) {
        this.idPersonne = idPersonne;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPhotoDeProfil() {
        return photoDeProfil;
    }

    public void setPhotoDeProfil(String photoDeProfil) {
        this.photoDeProfil = photoDeProfil;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
