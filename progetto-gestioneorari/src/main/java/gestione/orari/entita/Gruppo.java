package gestione.orari.entita;

public class Gruppo {
	
	private int idRuolo;
	private String descrizione;
	
	
	public Gruppo(int idRuolo, String descrizione) {
		super();
		this.idRuolo = idRuolo;
		this.descrizione = descrizione;
	}


	public int getIdRuolo() {
		return idRuolo;
	}


	public void setIdRuolo(int idRuolo) {
		this.idRuolo = idRuolo;
	}


	public String getDescrizione() {
		return descrizione;
	}


	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	
	

}
