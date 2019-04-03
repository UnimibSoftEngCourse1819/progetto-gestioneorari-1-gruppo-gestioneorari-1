package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "Persona" )
public class Persona {
	@Id
	@Column
	private int idPersona;
	@Column
	private String nome;
	@Column
	private String cognome; 
	@Column
	private String email;
	@Column
	private long telefono;
	@Column
	private int idGruppo;
	
	public Persona() {}
	
	public Persona(int idPersona, String nome, String cognome, String email, long telefono, int idGruppo) {
		super();
		this.idPersona = idPersona;
		this.idGruppo = idGruppo;
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.telefono = telefono;
	}
	
	
	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public int getIdGruppo() {
		return idGruppo;
	}

	public void setIdGruppo(int idGruppo) {
		this.idGruppo = idGruppo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("idPersona: ").append(idPersona);
		sb.append("idGruppo: ").append(idGruppo);
		sb.append("nome: ").append(nome);	
		sb.append("cognome: ").append(cognome);	
		sb.append("email: ").append(email);	
		sb.append("telefono: ").append(telefono);	
		return sb.toString();
	}
	
	

}
