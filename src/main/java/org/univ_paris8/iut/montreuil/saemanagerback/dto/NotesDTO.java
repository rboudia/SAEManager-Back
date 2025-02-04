package org.univ_paris8.iut.montreuil.saemanagerback.dto;

public class NotesDTO {

    private Integer idEval;
    private Integer idEleve;
    private Integer idRendu;
    private String note;

    public NotesDTO(Integer idEval, Integer idEleve, Integer idRendu, String note) {
        this.idEval = idEval;
        this.idEleve = idEleve;
        this.idRendu = idRendu;
        this.note = note;
    }

    public Integer getIdEval() {
        return idEval;
    }

    public void setIdEval(Integer idEval) {
        this.idEval = idEval;
    }

    public Integer getIdEleve() {
        return idEleve;
    }

    public void setIdEleve(Integer idEleve) {
        this.idEleve = idEleve;
    }

    public Integer getIdRendu() {
        return idRendu;
    }

    public void setIdRendu(Integer idRendu) {
        this.idRendu = idRendu;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
