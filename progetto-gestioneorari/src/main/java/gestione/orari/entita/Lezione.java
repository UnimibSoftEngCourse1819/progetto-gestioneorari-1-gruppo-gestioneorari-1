package gestione.orari.entita;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "Lezione" )
public class Lezione {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column
	private int idLezione;
	@Column
	private int idCorso;
	@Column
	String argomento;
	
	public Lezione() {}
	
	public Lezione(int idLezione, int idCorso) {
		setIdLezione(idLezione);
		setIdCorso(idCorso);
		setArgomento(argomento);
	}
	public Lezione(int idLezione, int idCorso, String argomento) {
		setIdLezione(idLezione);
		setIdCorso(idCorso);
		setArgomento(argomento);
	}
	
	public int getIdLezione() {
		return idLezione;
	}
	public void setIdLezione(int idLezione) {
		this.idLezione = idLezione;
	}
	public int getIdCorso() {
		return idCorso;
	}
	public void setIdCorso(int idCorso) {
		this.idCorso = idCorso;
	}
	public String getArgomento() {
		return argomento;
	}
	public void setArgomento(String argomento) {
		this.argomento = argomento;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("idLezione: ").append(idLezione);
		sb.append("idCorso: ").append(idCorso);	
		sb.append("argomento: ").append(argomento);
		return sb.toString();
	}
	
}
