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
    
    @Column(name = "nomeAnno")
    private String nomeAnno; //es. 2018-2019 
    
    @Column(name = "inizioPeriodo")
    private LocalDateTime inizioPeriodo;
    
    @Column(name = "finePeriodo")
    private LocalDateTime finePeriodo;

    public CalendarioDidattico() {};
    
    public CalendarioDidattico(int idCalendarioDidattico,
            String nomeAnno, LocalDateTime inizioPeriodo,
            LocalDateTime finePeriodo) {
        this.idCalendarioDidattico = idCalendarioDidattico;
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
