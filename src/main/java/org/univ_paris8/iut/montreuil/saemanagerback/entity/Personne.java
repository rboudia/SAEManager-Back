package org.univ_paris8.iut.montreuil.saemanagerback.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Personne")
public class Personne {

    @Id
    private int idpersonne;

    private String nom;
    private String prenom;
    private String photodeprofil;
    private String password;
    private String login;
    private String email;
    private String estadmin;
    private String estprof;

    public Personne(int idPersonne, String nom, String prenom, String photoDeProfil, String password, String login, String email, String estProf, String estAdmin) {
        this.idpersonne = idPersonne;
        this.nom = nom;
        this.prenom = prenom;
        this.photodeprofil = photoDeProfil;
        this.password = password;
        this.login = login;
        this.email = email;
        this.estprof = estProf;
        this.estadmin = estAdmin;
    }

    public Personne() {

    }

    public int getIdPersonne() {
        return idpersonne;
    }

    public void setIdPersonne(int idPersonne) {
        this.idpersonne = idPersonne;
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

    public String getPhotodeprofil() {
        return photodeprofil;
    }

    public void setPhotodeprofil(String photoDeProfil) {
        this.photodeprofil = photoDeProfil;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEstProf() {
        return estprof;
    }

    public void setEstProf(String estProf) {
        this.estprof = estProf;
    }

    public String getEstAdmin() {
        return estadmin;
    }

    public void setEstAdmin(String estAdmin) {
        this.estadmin = estAdmin;
    }
}
