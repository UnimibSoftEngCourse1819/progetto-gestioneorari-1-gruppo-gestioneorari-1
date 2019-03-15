package gestione.orari.entita;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ProfessoreCorso")
public class ProfessoreCorso {
    @Id
    @Column
   private int idProfessoreCorso;
    
    @Column
    private int idCorso;
    
    @Column
    private int idProfessore;

    public ProfessoreCorso(int idProfessoreCorso, int idCorso,
            int idProfessore) {
        this.idProfessoreCorso = idProfessoreCorso;
        this.idCorso = idCorso;
        this.idProfessore = idProfessore;
    }

    public int getIdProfessoreCorso() {
        return idProfessoreCorso;
    }

    public void setIdProfessoreCorso(int idProfessoreCorso) {
        this.idProfessoreCorso = idProfessoreCorso;
    }

    public int getIdCorso() {
        return idCorso;
    }

    public void setIdCorso(int idCorso) {
        this.idCorso = idCorso;
    }

    public int getIdProfessore() {
        return idProfessore;
    }

    public void setIdProfessore(int idProfessore) {
        this.idProfessore = idProfessore;
    }
    

}
