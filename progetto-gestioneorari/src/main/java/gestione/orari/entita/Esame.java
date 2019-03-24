package gestione.orari.entita;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "Esame" )
public class Esame {
	@Id
	@Column
	private int idEsame;
	@Column
	private String nomeEsame;
	@Column
	private LocalDateTime dataOraInizio;
	@Column
	private LocalDateTime dataOraFine;
	@Column
	private int numeroIscritti; 
	@Column
	private int idCorso;
	@Column
	private int idProfessore;
	
	public Esame() {}
	public Esame (int idEsame, String nomeEsame, LocalDateTime dataOraInizio, int idCorso, int idProfessore) {
		setIdEsame(idEsame);
		setNomeEsame(nomeEsame);
		setDataOraInizio(dataOraInizio);
		setDataOraFine(dataOraFine);
		setIdCorso(idCorso);
		setIdProfessore(idProfessore);
	}
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
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("idEsame: ").append(idEsame);
		sb.append("nomeEsame: ").append(nomeEsame);
		sb.append("dataOraInizio: ").append(dataOraInizio);	
		sb.append("dataOraFine: ").append(dataOraFine);
		sb.append("numeroIscritti: ").append(numeroIscritti);
		sb.append("idCorso: ").append(idCorso);
		sb.append("idProfessore: ").append(idProfessore);
		return sb.toString();
	}
}
