package gestione.orari.entita;

import java.time.LocalDateTime;

public class IscrizioneEsame {
	
	private int idIscrizioneEsame,idEsame, idStudente, idProfessore;
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
	
	
}
