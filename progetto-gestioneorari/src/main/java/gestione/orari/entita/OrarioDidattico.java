package gestione.orari.entita;

import java.time.LocalDateTime;

public class OrarioDidattico {
	int idOrarioDidattico;
	LocalDateTime giornoOraInizio;
	LocalDateTime giornoOraFine;
	int idSezione;
	int idSegretario;
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
	public int getIdSezione() {
		return idSezione;
	}
	public void setIdSezione(int idSezione) {
		this.idSezione = idSezione;
	}
	public int getIdSegretario() {
		return idSegretario;
	}
	public void setIdSegretario(int idSegretario) {
		this.idSegretario = idSegretario;
	}
	
	
}
