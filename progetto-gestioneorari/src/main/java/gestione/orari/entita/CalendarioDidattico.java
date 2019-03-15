package gestione.orari.entita;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "CalendarioDidattico")
public class CalendarioDidattico {
    
    @Id
    @Column(name = "idCalendarioDidattico")
    private int idCalendarioDidattico;
    
    @Column(name = "idSegretario")
    private int idSegretario;
    
    @Column(name = "nomeAnno")
    private String nomeAnno;
    
    @Column(name = "inizioPeriodo")
    private LocalDateTime inizioPeriodo;
    
    @Column(name = "finePeriodo")
    private LocalDateTime finePeriodo;

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
