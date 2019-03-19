package gestione.orari.entita;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table( name = "PrenotazioneAula" )
public class PrenotazioneAula {
 
	private int idPrenotazioneAula, idAula,idProfessore;
	private LocalDateTime giornoOraInizio, giornoOraFine;
	
	public PrenotazioneAula(int idPrenotazioneAula, int idAula, int idProfessore, LocalDateTime giornoOraInizio,
			LocalDateTime giornoOraFine) {
		super();
		this.idPrenotazioneAula = idPrenotazioneAula;
		this.idAula = idAula;
		this.idProfessore = idProfessore;
		this.giornoOraInizio = giornoOraInizio;
		this.giornoOraFine = giornoOraFine;
	}

	public int getIdPrenotazioneAula() {
		return idPrenotazioneAula;
	}

	public void setIdPrenotazioneAula(int idPrenotazioneAula) {
		this.idPrenotazioneAula = idPrenotazioneAula;
	}

	public int getIdAula() {
		return idAula;
	}

	public void setIdAula(int idAula) {
		this.idAula = idAula;
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
