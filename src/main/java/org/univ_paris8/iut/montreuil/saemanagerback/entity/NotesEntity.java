package org.univ_paris8.iut.montreuil.saemanagerback.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "notes")
public class NotesEntity {

    @Id
    @Column(name = "ideval")
    private Integer idEval;

    @Column(name = "ideleve")
    private Integer idEleve;

    @Column(name = "idrendu")
    private Integer idRendu;

    @Column(name = "note")
    private String note;

    public NotesEntity(Integer idEval, int idEleve, int idRendu, String note) {
        this.idEval = idEval;
        this.idEleve = idEleve;
        this.idRendu = idRendu;
        this.note = note;
    }

    public NotesEntity() {

    }

    public Integer getIdEval() {
        return idEval;
    }

    public void setIdEval(Integer ideval) {
        this.idEval = ideval;
    }

    public Integer getIdEleve() {
        return idEleve;
    }

    public void setIdEleve(Integer ideleve) {
        this.idEleve = ideleve;
    }

    public Integer getIdRendu() {
        return idRendu;
    }

    public void setIdRendu(Integer idrendu) {
        this.idRendu = idrendu;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
