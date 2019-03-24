package gestione.orari.entita;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "PrenotazioneAula" )
public class PrenotazioneAula {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column
	private int idPrenotazioneAula;
	@Column
	private int idAula;
	@Column
	private int idProfessore;
	@Column
	private LocalDateTime giornoOraInizio;
	@Column
	private LocalDateTime giornoOraFine;
	
	public PrenotazioneAula() {}
	public PrenotazioneAula(int idPrenotazioneAula, LocalDateTime giornoOraInizio,
			LocalDateTime giornoOraFine, int idAula, int idProfessore) {
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
