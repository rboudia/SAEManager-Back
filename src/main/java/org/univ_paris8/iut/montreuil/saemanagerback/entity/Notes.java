package org.univ_paris8.iut.montreuil.saemanagerback.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "notes")
public class Notes {
    @Id
    private int ideval;

    private int ideleve;
    private int idrendu;
    private String note;

    public Notes(int idEval, int idEleve, int idRendu, String note) {
        this.ideval = idEval;
        this.ideleve = idEleve;
        this.idrendu = idRendu;
        this.note = note;
    }

    public Notes() {

    }

    public int getIdeval() {
        return ideval;
    }

    public void setIdeval(int ideval) {
        this.ideval = ideval;
    }

    public int getIdeleve() {
        return ideleve;
    }

    public void setIdeleve(int ideleve) {
        this.ideleve = ideleve;
    }

    public int getIdrendu() {
        return idrendu;
    }

    public void setIdrendu(int idrendu) {
        this.idrendu = idrendu;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
