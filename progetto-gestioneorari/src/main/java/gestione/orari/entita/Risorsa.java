package gestione.orari.entita;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Risorsa")
public class Risorsa {
    
    @Id
    @Column
    private String idRisorsa;
    
    @Column
    private String nome;
    
    @Column
    private String descrizione;
    
    @Column
    private int idTipologiaRisorsa;
    
    @Column
    private String commento;
    
    public Risorsa() {
    	
    }
    public Risorsa(String idRisorsa,String nome, String descrizione, int idTipologiaRisorsa) {
    	setIdRisorsa(idRisorsa);
    	setNome(nome);
    	setDescrizione(descrizione);
    	setIdTipologiaRisorsa(idTipologiaRisorsa);
    	
    }
    public Risorsa(String idRisorsa,String nome, String descrizione, int idTipologiaRisorsa, String commento) {
    	setIdRisorsa(idRisorsa);
    	setNome(nome);
    	setDescrizione(descrizione);
    	setIdTipologiaRisorsa(idTipologiaRisorsa);
    	setCommento(commento);
    }

	public String getIdRisorsa() {
		return idRisorsa;
	}

	public void setIdRisorsa(String idRisorsa) {
		this.idRisorsa = idRisorsa;
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

	public int getIdTipologiaRisorsa() {
		return idTipologiaRisorsa;
	}

	public void setIdTipologiaRisorsa(int idTipologiaRisorsa) {
		this.idTipologiaRisorsa = idTipologiaRisorsa;
	}

	public String getCommento() {
		return commento;
	}

	public void setCommento(String commento) {
		this.commento = commento;
	}
	@Override
   	public String toString() {
   		StringBuilder sb = new StringBuilder();
   		sb.append("idRisorsa: ").append(idRisorsa);
   		sb.append("nome: ").append(nome);
   		sb.append("descrizione: ").append(descrizione);
   		sb.append("idTipologiaRisorsa: ").append(idTipologiaRisorsa);	
   		sb.append("commento: ").append(commento);
   		return sb.toString();
   	}
    
}
