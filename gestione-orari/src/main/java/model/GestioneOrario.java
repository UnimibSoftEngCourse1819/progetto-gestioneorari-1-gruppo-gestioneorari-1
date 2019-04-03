package gestione.orari.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table( name = "GestioneOrario" )
public class GestioneOrario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int idGestioneOrario;
	@Column
	private int idOrario;
	@Column
	private int idSegretario;
	
	public GestioneOrario() {}
	
	public GestioneOrario (int idGestioneOrario, int idOrario, int idSegretario){
		setIdGestioneOrario(idGestioneOrario);
		setIdOrario(idOrario);
		setIdSegretario(idSegretario);
	}
	
	public int getIdGestioneOrario() {
		return idGestioneOrario;
	}
	public void setIdGestioneOrario(int idGestioneOrario) {
		this.idGestioneOrario = idGestioneOrario;
	}
	public int getIdOrario() {
		return idOrario;
	}
	public void setIdOrario(int idOrario) {
		this.idOrario = idOrario;
	}
	public int getIdSegretario() {
		return idSegretario;
	}
	public void setIdSegretario(int idSegretario) {
		this.idSegretario = idSegretario;
	}
	 @Override
	    public String toString() {
	        StringBuilder sb = new StringBuilder();
	        sb.append("idGestioneOrario: ").append(idGestioneOrario);
	        sb.append("idOrario: ").append(idOrario);
	        sb.append("idSegretario: ").append(idSegretario);
	        return sb.toString();
	    }
	
}
