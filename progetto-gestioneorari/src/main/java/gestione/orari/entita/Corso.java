package gestione.orari.entita;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Corso")
public class Corso {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int idCorso;
    
    @Column
    private int idCorsoDiLaurea;
    
    @Column
    private int annoDiCorso;
    
    @Column
    private String nome;
    
    @Column
    private String descrizione;
    
    public Corso(int idCorso, int idCorsoDiLaurea, int annoDiCorso, String nome,
            String descrizione) {
        this.idCorso = idCorso;
        this.idCorsoDiLaurea = idCorsoDiLaurea;
        this.annoDiCorso = annoDiCorso;
        this.nome = nome;
        this.descrizione = descrizione;
    }
    public int getIdCorso() {
        return idCorso;
    }
    public void setIdCorso(int idCorso) {
        this.idCorso = idCorso;
    }
    public int getIdCorsoDiLaurea() {
        return idCorsoDiLaurea;
    }
    public void setIdCorsoDiLaurea(int idCorsoDiLaurea) {
        this.idCorsoDiLaurea = idCorsoDiLaurea;
    }
    public int getAnnoDiCorso() {
        return annoDiCorso;
    }
    public void setAnnoDiCorso(int annoDiCorso) {
        this.annoDiCorso = annoDiCorso;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescrizione() {
        return descrizione;
    }
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
    
}
