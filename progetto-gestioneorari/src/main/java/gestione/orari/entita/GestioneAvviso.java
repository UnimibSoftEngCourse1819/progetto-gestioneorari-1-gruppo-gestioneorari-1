package gestione.orari.entita;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "GestioneAvviso" )
public class GestioneAvviso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int idGestioneAvviso;
	@Column
	private int idAvviso;
	@Column
	private int idPersona;
	
	public GestioneAvviso() {}
	
	public GestioneAvviso(int idGestioneAvviso,int idAvviso, int idPersona) {
		setIdGestioneAvviso(idGestioneAvviso);
		setIdAvviso(idAvviso);
		setIdPersona(idPersona);
	}
	
	public int getIdGestioneAvviso() {
		return idGestioneAvviso;
	}
	public void setIdGestioneAvviso(int idGestioneAvviso) {
		this.idGestioneAvviso = idGestioneAvviso;
	}
	public int getIdAvviso() {
		return idAvviso;
	}
	public void setIdAvviso(int idAvviso) {
		this.idAvviso = idAvviso;
	}
	public int getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("idGestioneAvviso: ").append(idGestioneAvviso);
		sb.append("idAvviso: ").append(idAvviso);
		sb.append("idPersona: ").append(idPersona);
		return sb.toString();
	}
	
}
