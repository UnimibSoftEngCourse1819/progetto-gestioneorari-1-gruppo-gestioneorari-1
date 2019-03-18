package gestione.orari.entita;

import java.time.LocalDateTime;

public class Esame {

	private int idEsame;
	private String nomeEsame;
	private LocalDateTime dataOraInizio;
	private LocalDateTime dataOraFine;
	private int numeroIscritti; 
	private int idCorso;
	private int idProfessore;
	
	public Esame (int idEsame, String nomeEsame, LocalDateTime dataOraInizio, int numeroIscritti, int idCorso, int idProfessore) {
		setIdEsame(idEsame);
		setNomeEsame(nomeEsame);
		setDataOraInizio(dataOraInizio);
		setDataOraFine(dataOraFine);
		setNumeroIscritti(numeroIscritti);
		setIdCorso(idCorso);
		setIdProfessore(idProfessore);
	}
	
	public int getIdEsame() {
		return idEsame;
	}
	
	public void setIdEsame(int idEsame) {
		this.idEsame = idEsame;
	}
	public String getNomeEsame() {
		return nomeEsame;
	}
	public void setNomeEsame(String nomeEsame) {
		this.nomeEsame = nomeEsame;
	}
	public LocalDateTime getDataOraInizio() {
		return dataOraInizio;
	}
	public void setDataOraInizio(LocalDateTime dataOraInizio) {
		this.dataOraInizio = dataOraInizio;
	}
	public LocalDateTime getDataOraFine() {
		return dataOraFine;
	}
	public void setDataOraFine(LocalDateTime dataOraFine) {
		this.dataOraFine = dataOraFine;
	}
	public int getNumeroIscritti() {
		return numeroIscritti;
	}
	public void setNumeroIscritti(int numeroIscritti) {
		this.numeroIscritti = numeroIscritti;
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
