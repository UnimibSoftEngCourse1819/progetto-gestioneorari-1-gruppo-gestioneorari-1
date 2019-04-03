package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table( name = "Avviso" )
public class Avviso{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int idAvviso;
	@Column
	private int idCorso;
	@Column
	private String descrizione;
	
	
	//costruttore vuoto
	public Avviso() {}
	public Avviso(int idAvviso, String descrizione) {
		super();
		setIdAvviso(idAvviso);
		setDescrizione(descrizione);
	
	}
	public Avviso(int idAvviso, String descrizione, int idCorso) {
		super();
		setIdAvviso(idAvviso);
		setDescrizione(descrizione);
		setIdCorso(idCorso);
	
	}

	public int getIdAvviso() {
		return idAvviso;
	}
	public void setIdAvviso(int idAvviso) {
		this.idAvviso = idAvviso;
	}
	public int getIdCorso() {
		return idCorso;
	}
	public void setIdCorso(int idCorso) {
		this.idCorso = idCorso;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("idAvviso: ").append(idAvviso);
		sb.append("idCorso: ").append(idCorso);
		sb.append("descrizione: ").append(descrizione);	
		return sb.toString();
	}
	
}
