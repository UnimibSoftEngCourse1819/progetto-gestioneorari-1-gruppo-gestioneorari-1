package gestione.orari.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table( name = "Gruppo" )
public class Gruppo {
	
	@Id
	@Column
	private int idGruppo;
	@Column
	private String descrizione;
	
	public Gruppo() {}
	
	public Gruppo(int idGruppo, String descrizione) {
		
		setIdGruppo(idGruppo);
		setDescrizione(descrizione);
	}

	public int getIdGruppo() {
		return idGruppo;
	}
	public void setIdGruppo(int idGruppo) {
		this.idGruppo = idGruppo;
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
		sb.append("idGruppo: ").append(idGruppo);
		sb.append("descrizione: ").append(descrizione);
		return sb.toString();
	}
	

}
