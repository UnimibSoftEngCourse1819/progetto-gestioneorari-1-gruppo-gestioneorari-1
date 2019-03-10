package gestione.orari.entita;

public class BachecaAvvisi {

	private String avviso;
	private int idSegretario, idProfessore, idBachecaAvvisi;
	
	
	public BachecaAvvisi(String avviso, int idSegretario, int idProfessore, int idBachecaAvvisi) {
		super();
		this.avviso = avviso;
		this.idSegretario = idSegretario;
		this.idProfessore = idProfessore;
		this.idBachecaAvvisi = idBachecaAvvisi;
	}


	public String getAvviso() {
		return avviso;
	}


	public void setAvviso(String avviso) {
		this.avviso = avviso;
	}


	public int getIdSegretario() {
		return idSegretario;
	}


	public void setIdSegretario(int idSegretario) {
		this.idSegretario = idSegretario;
	}


	public int getIdProfessore() {
		return idProfessore;
	}


	public void setIdProfessore(int idProfessore) {
		this.idProfessore = idProfessore;
	}


	public int getIdBachecaAvvisi() {
		return idBachecaAvvisi;
	}


	public void setIdBachecaAvvisi(int idBachecaAvvisi) {
		this.idBachecaAvvisi = idBachecaAvvisi;
	}
	
	
	
}
