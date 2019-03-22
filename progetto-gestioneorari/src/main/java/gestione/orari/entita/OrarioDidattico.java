package gestione.orari.entita;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "OrarioDidattico")
public class OrarioDidattico {
	
	@Id
    @Column
    private int idOrarioDidattico;
	
	@Column
    private LocalDateTime giornoOraInizio;
	
	@Column
	private LocalDateTime giornoOraFine;
    
	@Column
	private int idLezione;
	
	public OrarioDidattico () {};	
	
    public OrarioDidattico(int idOrarioDidattico, LocalDateTime giornoOraInizio, LocalDateTime giornoOraFine,
			int idLezione) {
		super();
		this.idOrarioDidattico = idOrarioDidattico;
		this.giornoOraInizio = giornoOraInizio;
		this.giornoOraFine = giornoOraFine;
		this.idLezione = idLezione;
	}

	public int getIdOrarioDidattico() {
        return idOrarioDidattico;
    }

    public void setIdOrarioDidattico(int idOrarioDidattico) {
        this.idOrarioDidattico = idOrarioDidattico;
    }

    public LocalDateTime getGiornoOraInizio() {
        return giornoOraInizio;
    }

    public void setGiornoOraInizio(LocalDateTime giornoOraInizio) {
        this.giornoOraInizio = giornoOraInizio;
    }

    public LocalDateTime getGiornoOraFine() {
        return giornoOraFine;
    }

    public void setGiornoOraFine(LocalDateTime giornoOraFine) {
        this.giornoOraFine = giornoOraFine;
    }

    public int getIdLezione() {
        return idLezione;
    }

    public void setIdLezione(int idLezione) {
        this.idLezione = idLezione;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("idOrarioDidattico: ").append(idOrarioDidattico);
        sb.append("giornoOraInizio: ").append(giornoOraInizio);
        sb.append("giornoOraFine: ").append(giornoOraFine);
        sb.append("idLezione: ").append(idLezione);
        return sb.toString();
    }

}
