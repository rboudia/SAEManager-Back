package org.univ_paris8.iut.montreuil.saemanagerback.entity;

import jakarta.persistence.*;
import org.univ_paris8.iut.montreuil.saemanagerback.entity.composite.EtudiantGroupeId;



@Entity
@Table(name = "etudiantgroupe")
@IdClass(EtudiantGroupeId.class)
public class EtudiantGroupe {

    @Id
    private Integer idgroupe;

    @Id
    private Integer idetudiant;

    public EtudiantGroupe(Integer idgroupe, Integer idetudiant) {
        this.idgroupe = idgroupe;
        this.idetudiant = idetudiant;
    }

    public EtudiantGroupe() {}

    public Integer getIdgroupe() {
        return idgroupe;
    }

    public void setIdgroupe(Integer idgroupe) {
        this.idgroupe = idgroupe;
    }

    public Integer getIdetudiant() {
        return idetudiant;
    }

    public void setIdetudiant(Integer idetudiant) {
        this.idetudiant = idetudiant;
    }
}
