package gestione.orari.entita;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "IscrizioneEsame" )
public class IscrizioneEsame {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idIscrizioneEsame;
	private int idEsame, idStudente, idProfessore;
	private String note;
	private LocalDateTime giornoOra;
	private LocalDateTime scadenzaLimiteIscrizione;
	
	public IscrizioneEsame(int idIscrizioneEsame,int idEsame, int idProfessore, LocalDateTime giornoOra, LocalDateTime scadenzaLimiteIscrizione, String note, int idStudente) {
		setIdIscrizioneEsame(idIscrizioneEsame);
		setIdEsame(idEsame);
		setIdStudente(idStudente);
		setIdProfessore(idProfessore);
		setNote(note);
		setGiornoOra(giornoOra);
		setScadenzaLimiteIscrizione(scadenzaLimiteIscrizione);
	}
	
	
	public int getIdIscrizioneEsame() {
		return idIscrizioneEsame;
	}
	public void setIdIscrizioneEsame(int idIscrizioneEsame) {
		this.idIscrizioneEsame = idIscrizioneEsame;
	}
	public int getIdEsame() {
		return idEsame;
	}
	public void setIdEsame(int idEsame) {
		this.idEsame = idEsame;
	}
	public int getIdStudente() {
		return idStudente;
	}
	public void setIdStudente(int idStudente) {
		this.idStudente = idStudente;
	}
	public int getIdProfessore() {
		return idProfessore;
	}
	public void setIdProfessore(int idProfessore) {
		this.idProfessore = idProfessore;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public LocalDateTime getGiornoOra() {
		return giornoOra;
	}
	public void setGiornoOra(LocalDateTime giornoOra) {
		this.giornoOra = giornoOra;
	}
	public LocalDateTime getScadenzaLimiteIscrizione() {
		return scadenzaLimiteIscrizione;
	}
	public void setScadenzaLimiteIscrizione(LocalDateTime scadenzaLimiteIscrizione) {
		this.scadenzaLimiteIscrizione = scadenzaLimiteIscrizione;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("idIscrizioneEsame: ").append(idIscrizioneEsame);
		sb.append("idEsame: ").append(idEsame);
		sb.append("idStudente: ").append(idStudente);
		sb.append("idProfessore: ").append(idProfessore);
		sb.append("note: ").append(note);
		sb.append("giornoOra: ").append(giornoOra);
		sb.append("scadenzaLimiteIscrizione: ").append(scadenzaLimiteIscrizione);
		return sb.toString();
	}
	
}
