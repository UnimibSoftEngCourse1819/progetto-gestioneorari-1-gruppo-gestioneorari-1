package gestione.orari.entita;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "AulaEsame" )
public class AulaEsame {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAulaEsame;
	private int idAula;
	private int idEsame;
	
	public AulaEsame(int idAulaEsame, int idAula, int idEsame) {
		setIdAula(idAula);
		setIdEsame(idEsame);
		setIdAulaEsame(idAulaEsame);
	}
	
	public int getIdAula() {
		return idAula;
	}
	public void setIdAula(int idAula) {
		this.idAula = idAula;
	}
	public int getIdEsame() {
		return idEsame;
	}
	public void setIdEsame(int idEsame) {
		this.idEsame = idEsame;
	}
	public int getIdAulaEsame() {
		return idAulaEsame;
	}
	public void setIdAulaEsame(int idAulaEsame) {
		this.idAulaEsame = idAulaEsame;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("idAulaEsame: ").append(idAulaEsame);
		sb.append("idAula: ").append(idAula);
		sb.append("idEsame: ").append(idEsame);
		return sb.toString();
	}
	
}
