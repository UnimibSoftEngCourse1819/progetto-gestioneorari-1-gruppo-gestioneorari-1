package gestione.orari.entita;

public class Autenticazione {

	
private String username,password;
private int idPersona;



public Autenticazione(String username, String password, int idPersona) {
	super();
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
	return "Autenticazione [username=" + username + ", password=" + password + ", idPersona=" + idPersona + "]";
}



}
