package gestione.orari.entita;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TipologiaRisorsa")
public class TipologiaRisorsa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int idTipologiaRisorsa;
	@Column
	private String nome;
	@Column
	private String descrizione;
	
	public TipologiaRisorsa () {}
	
	public TipologiaRisorsa (int idTipologiaRisorsa, String nome) {
		setIdTipologiaRisorsa(idTipologiaRisorsa);
		setNome(nome);
		
	}
	public TipologiaRisorsa (int idTipologiaRisorsa, String nome, String descrizione) {
		setIdTipologiaRisorsa(idTipologiaRisorsa);
		setNome(nome);
		setDescrizione(descrizione);
	}

	public int getIdTipologiaRisorsa() {
		return idTipologiaRisorsa;
	}

	public void setIdTipologiaRisorsa(int idTipologiaRisorsa) {
		this.idTipologiaRisorsa = idTipologiaRisorsa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
   		sb.append("idTipologiaRisorsa: ").append(idTipologiaRisorsa);
   		sb.append("nome: ").append(nome);
   		sb.append("descrizione: ").append(descrizione);
   		return sb.toString();
   	}
	
}
