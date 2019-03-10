package gestione.orari.entita;

import java.time.LocalDateTime;

public class PrenotazioneProiettore {

	private int idPrenotazione, idProiettore, idProfessore;
	private LocalDateTime giornoOraInizio, giornoOraFine;
	
	
	
	public PrenotazioneProiettore(int idPrenotazione, int idProiettore, int idProfessore, LocalDateTime giornoOraInizio,
			LocalDateTime giornoOraFine) {
		super();
		this.idPrenotazione = idPrenotazione;
		this.idProiettore = idProiettore;
		this.idProfessore = idProfessore;
		this.giornoOraInizio = giornoOraInizio;
		this.giornoOraFine = giornoOraFine;
	}
	
	public int getIdPrenotazione() {
		return idPrenotazione;
	}
	public void setIdPrenotazione(int idPrenotazione) {
		this.idPrenotazione = idPrenotazione;
	}
	public int getIdProiettore() {
		return idProiettore;
	}
	public void setIdProiettore(int idProiettore) {
		this.idProiettore = idProiettore;
	}
	public int getIdProfessore() {
		return idProfessore;
	}
	public void setIdProfessore(int idProfessore) {
		this.idProfessore = idProfessore;
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
	
	
}
