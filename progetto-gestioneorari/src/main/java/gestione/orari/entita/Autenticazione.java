package gestione.orari.entita;

public class Autenticazione {

	
private String username,password,gruppo;
private int idStudente,idProfessore,idSegretario;

public Autenticazione(String username, String password, String gruppo, int idStudente, int idProfessore,
		int idSegretario) {
	super();
	this.username = username;
	this.password = password;
	this.gruppo = gruppo;
	this.idStudente = idStudente;
	this.idProfessore = idProfessore;
	this.idSegretario = idSegretario;
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

public String getGruppo() {
	return gruppo;
}

public void setGruppo(String gruppo) {
	this.gruppo = gruppo;
}

public int getIdStudente() {
	return idStudente;
}

public void setIdStudente(int idStudente) {
	this.idStudente = idStudente;
}

public int getIdProfessore() {
	return idProfessore;
}

public void setIdProfessore(int idProfessore) {
	this.idProfessore = idProfessore;
}

public int getIdSegretario() {
	return idSegretario;
}

public void setIdSegretario(int idSegretario) {
	this.idSegretario = idSegretario;
}





}
