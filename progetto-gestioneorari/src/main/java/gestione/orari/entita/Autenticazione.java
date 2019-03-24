package gestione.orari.entita;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table( name = "Autenticazione" )
public class Autenticazione {
	@Id
	@Column	
	private String username;
	@Column	
	private String password;
	@Column	
	private int idPersona;

	public Autenticazione() {}

	public Autenticazione(String username, String password, int idPersona) {
		this.username = username;
		this.password = password;
		this.idPersona = idPersona;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
		sb.append("username: ").append(username);
		sb.append("password: ").append(password);
		sb.append("idPersona: ").append(idPersona);
		return sb.toString();
	}	

}
