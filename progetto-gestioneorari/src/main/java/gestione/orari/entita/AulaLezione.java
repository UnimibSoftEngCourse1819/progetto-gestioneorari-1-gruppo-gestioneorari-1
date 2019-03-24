package gestione.orari.entita;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "AulaLezione" )
public class AulaLezione {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAulaLezione;
	@Column
	private int idAula;
	@Column
	private int idLezione;
	
	public AulaLezione() {}
	public AulaLezione(int idAulaLezione, int idAula, int idLezione) {
		setIdAulaLezione(idAulaLezione);
		setIdAula(idAula);
		setIdLezione(idLezione);
		
	}
	
	public int getIdAula() {
		return idAula;
	}
	public void setIdAula(int idAula) {
		this.idAula = idAula;
	}
	public int getIdAulaLezione() {
		return idAulaLezione;
	}
	public void setIdAulaLezione(int idAulaLezione) {
		this.idAulaLezione = idAulaLezione;
	}
	public int getIdLezione() {
		return idLezione;
	}

	public void setIdLezione(int idLezione) {
		this.idLezione = idLezione;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("idAulaLezione: ").append(idAulaLezione);
		sb.append("idAula: ").append(idAula);
		sb.append("idLezione: ").append(idLezione);
		return sb.toString();
	}

}
