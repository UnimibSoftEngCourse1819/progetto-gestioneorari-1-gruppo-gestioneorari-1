package gestione.orari.entita;

import java.time.LocalDateTime;

public class CalendarioDidattico {
    int idCalendarioDidattico, idSegretario;
    String nomeAnno;
    LocalDateTime inizioPeriodo, finePeriodo;

    public CalendarioDidattico(int idCalendarioDidattico, int idSegretario,
            String nomeAnno, LocalDateTime inizioPeriodo,
            LocalDateTime finePeriodo) {
        this.idCalendarioDidattico = idCalendarioDidattico;
        this.idSegretario = idSegretario;
        this.nomeAnno = nomeAnno;
        this.inizioPeriodo = inizioPeriodo;
        this.finePeriodo = finePeriodo;
    }

    public int getIdCalendarioDidattico() {
        return idCalendarioDidattico;
    }

    public void setIdCalendarioDidattico(int idCalendarioDidattico) {
        this.idCalendarioDidattico = idCalendarioDidattico;
    }

    public int getIdSegretario() {
        return idSegretario;
    }

    public void setIdSegretario(int idSegretario) {
        this.idSegretario = idSegretario;
    }

    public String getNomeAnno() {
        return nomeAnno;
    }

    public void setNomeAnno(String nomeAnno) {
        this.nomeAnno = nomeAnno;
    }

    public LocalDateTime getInizioPeriodo() {
        return inizioPeriodo;
    }

    public void setInizioPeriodo(LocalDateTime inizioPeriodo) {
        this.inizioPeriodo = inizioPeriodo;
    }

    public LocalDateTime getFinePeriodo() {
        return finePeriodo;
    }

    public void setFinePeriodo(LocalDateTime finePeriodo) {
        this.finePeriodo = finePeriodo;
    }

}
