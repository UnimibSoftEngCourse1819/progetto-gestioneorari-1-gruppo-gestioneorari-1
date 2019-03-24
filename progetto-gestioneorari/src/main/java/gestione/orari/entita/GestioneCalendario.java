package gestione.orari.entita;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table( name = "GestioneCalendario" )
public class GestioneCalendario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int idGestioneCalendario;
	@Column
	private int idCalendarioDidattico;
	@Column
	private int idPersona;
	
	public GestioneCalendario() {}
	
	public GestioneCalendario(int idGestioneCalendario, int idCalendarioDidattico, int idPersona ) {
		setIdGestioneCalendario(idGestioneCalendario);
		setIdCalendarioDidattico(idCalendarioDidattico);
		setIdPersona(idPersona);
	}
	public int getIdGestioneCalendario() {
		return idGestioneCalendario;
	}
	public void setIdGestioneCalendario(int idGestioneCalendario) {
		this.idGestioneCalendario = idGestioneCalendario;
	}
	public int getIdCalendarioDidattico() {
		return idCalendarioDidattico;
	}
	public void setIdCalendarioDidattico(int idCalendarioDidattico) {
		this.idCalendarioDidattico = idCalendarioDidattico;
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
	        sb.append("idGestioneCalendario: ").append(idGestioneCalendario);
	        sb.append("idCalendarioDidattico: ").append(idCalendarioDidattico);
	        sb.append("idPersona: ").append(idPersona);
	        return sb.toString();
	    }
}
