package gestione.orari.entita;

public class Aula {

	private int idAula;
	private String nomeAula;
	private String edificio;
	private int capienza;
	
	public Aula(int idAula, String nomeAula, String edificio, int capienza){
		setIdAula(idAula);
		setNomeAula(nomeAula);
		setEdificio(edificio);
		setCapienza(capienza);
	}
	
	public int getIdAula() {
		return idAula;
	}
	public void setIdAula(int idAula) {
		this.idAula = idAula;
	}
	public String getNomeAula() {
		return nomeAula;
	}
	public void setNomeAula(String nomeAula) {
		this.nomeAula = nomeAula;
	}
	public String getEdificio() {
		return edificio;
	}
	public void setEdificio(String edificio) {
		this.edificio = edificio;
	}
	public int getCapienza() {
		return capienza;
	}
	public void setCapienza(int capienza) {
		this.capienza = capienza;
	}
	
	
}
