package gestione.orari.entita;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//
@Entity
@Table( name = "Aula" )
public class Aula {
	@Id
	@Column
	private int idAula;
	@Column
	private String nomeAula;
	@Column
	private String edificio;
	@Column
	private int capienza;
	
	public Aula(){}
	public Aula(int idAula, String nomeAula, String edificio, int capienza){
		setIdAula(idAula);
		setNomeAula(nomeAula);
		setEdificio(edificio);
		setCapienza(capienza);
	}
	
	public int getIdAula() {
		return idAula;
	}
	public void setIdAula(int idAula) {
		this.idAula = idAula;
	}
	public String getNomeAula() {
		return nomeAula;
	}
	public void setNomeAula(String nomeAula) {
		this.nomeAula = nomeAula;
	}
	public String getEdificio() {
		return edificio;
	}
	public void setEdificio(String edificio) {
		this.edificio = edificio;
	}
	public int getCapienza() {
		return capienza;
	}
	public void setCapienza(int capienza) {
		this.capienza = capienza;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("idAula: ").append(idAula);
		sb.append("nomeAula: ").append(nomeAula);
		sb.append("edificio: ").append(edificio);	
		sb.append("capienza: ").append(capienza);
		return sb.toString();
	}
	
}
