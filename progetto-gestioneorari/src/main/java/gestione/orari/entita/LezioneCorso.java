package gestione.orari.entita;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "LezioneCorso" )
public class LezioneCorso {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column
	private int idLezioneCorso;
	@Column
	private int idLezione;
	@Column
	private int idCorso;
	
	public LezioneCorso(int idLezione,int idCorso,int idLezioneCorso) {
		setIdLezione(idLezione);
		setIdCorso(idCorso);
		setIdLezioneCorso(idLezioneCorso);
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

	public int getIdLezioneCorso() {
		return idLezioneCorso;
	}

	public void setIdLezioneCorso(int idLezioneCorso) {
		this.idLezioneCorso = idLezioneCorso;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("idLezioneCorso: ").append(idLezioneCorso);
		sb.append("idLezione: ").append(idLezione);
		sb.append("idCorso: ").append(idCorso);	
		return sb.toString();
	}
	
	
}
