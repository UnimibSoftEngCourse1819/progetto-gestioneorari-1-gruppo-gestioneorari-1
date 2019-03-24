package gestione.orari.entita;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PrenotazioneRisorsa")
public class PrenotazioneRisorsa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int idPrenotazioneRisorsa;
	@Column
	private LocalDateTime giornoOraInizio; 
	@Column
	private LocalDateTime giornoOraFine;
	@Column
	private String idRisorsa;
	@Column
	private int idProfessore;
	
	public PrenotazioneRisorsa() {}
	
	public PrenotazioneRisorsa(int idPrenotazioneRisorsa, LocalDateTime giornoOraInizio, LocalDateTime giornoOraFine, String idRisorsa, int idProfessore) {
		setIdPrenotazioneRisorsa(idPrenotazioneRisorsa);
		setGiornoOraInizio(giornoOraInizio);
		setGiornoOraFine(giornoOraFine);
		setIdRisorsa(idRisorsa);
		setIdProfessore(idProfessore);
	}
	
	 public int getIdPrenotazioneRisorsa() {
		return idPrenotazioneRisorsa;
	}

	public void setIdPrenotazioneRisorsa(int idPrenotazioneRisorsa) {
		this.idPrenotazioneRisorsa = idPrenotazioneRisorsa;
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

	public String getIdRisorsa() {
		return idRisorsa;
	}

	public void setIdRisorsa(String idRisorsa) {
		this.idRisorsa = idRisorsa;
	}

	public int getIdProfessore() {
		return idProfessore;
	}

	public void setIdProfessore(int idProfessore) {
		this.idProfessore = idProfessore;
	}

	@Override
	   	public String toString() {
	   		StringBuilder sb = new StringBuilder();
	   		sb.append("idPrenotazioneRisorsa: ").append(idPrenotazioneRisorsa);
	   		sb.append("giornoOraInizio: ").append(giornoOraInizio);
	   		sb.append("giornoOraFine: ").append(giornoOraFine);
	   		sb.append("idRisorsa: ").append(idRisorsa);	
	   		sb.append("idProfessore: ").append(idProfessore);
	   		return sb.toString();
	   	}
	
	
}
