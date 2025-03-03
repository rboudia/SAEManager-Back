package org.univ_paris8.iut.montreuil.saemanagerback.dto;


import java.util.List;

public class GroupeDTO {
    private String nom;
    private String imageTitre;
    private Integer idSae;
    private Integer estModifiableParEleve;
    private List<Integer> idsEtudiants;

    public GroupeDTO(String nom, String imageTitre, Integer idSae, Integer estModifiableParEleve, List<Integer> idsEtudiants) {
        this.nom = nom;
        this.imageTitre = imageTitre;
        this.idSae = idSae;
        this.estModifiableParEleve = estModifiableParEleve;
        this.idsEtudiants = idsEtudiants;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getImageTitre() {
        return imageTitre;
    }

    public void setImageTitre(String imageTitre) {
        this.imageTitre = imageTitre;
    }

    public Integer getIdSae() {
        return idSae;
    }

    public void setIdSae(Integer idSae) {
        this.idSae = idSae;
    }

    public Integer getEstModifiableParEleve() {
        return estModifiableParEleve;
    }

    public void setEstModifiableParEleve(Integer estModifiableParEleve) {
        this.estModifiableParEleve = estModifiableParEleve;
    }

    public List<Integer> getIdsEtudiants() {
        return idsEtudiants;
    }

    public void setIdsEtudiants(List<Integer> idsEtudiants) {
        this.idsEtudiants = idsEtudiants;
    }
}
