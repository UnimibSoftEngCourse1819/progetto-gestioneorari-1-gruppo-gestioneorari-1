package gestione.orari.entita;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table( name = "OrarioDidattico" )
public class OrarioDidattico {
	
	private int idOrarioDidattico;
	private LocalDateTime giornoOraInizio;
	private LocalDateTime giornoOraFine;
	private int idLezione;
	
	public OrarioDidattico(int idOrarioDidattico, LocalDateTime giornoOraInizio, LocalDateTime giornoOraFine, int idLezione) {
		setIdOrarioDidattico(idOrarioDidattico) ;
		setGiornoOraInizio(giornoOraInizio) ;
		setGiornoOraFine(giornoOraFine) ;
		setIdLezione(idLezione);
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
