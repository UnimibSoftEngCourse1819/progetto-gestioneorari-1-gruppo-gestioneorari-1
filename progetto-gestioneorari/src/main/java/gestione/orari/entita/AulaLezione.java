package gestione.orari.entita;

public class AulaLezione {
	
	private int idAula;
	private int idLezione;
	private int idAulaLezione;
	
	public AulaLezione(int idAula, int idEsame, int idAulaLezione) {
		setIdAula(idAula);
		setIdLezione(idLezione);
		setIdAulaLezione(idAulaLezione);
	}
	
	public int getIdAula() {
		return idAula;
	}
	public void setIdAula(int idAula) {
		this.idAula = idAula;
	}
	public int getIdAulaLezione() {
		return idAulaLezione;
	}
	public void setIdAulaLezione(int idAulaLezione) {
		this.idAulaLezione = idAulaLezione;
	}
	public int getIdLezione() {
		return idLezione;
	}

	public void setIdLezione(int idLezione) {
		this.idLezione = idLezione;
	}
	

}
