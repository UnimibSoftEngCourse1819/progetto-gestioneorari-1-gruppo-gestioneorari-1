package gestione.orari.entita;

public class Proiettore {
    int idProiettore, capienza;
    String nomeAula, edificio;
    public Proiettore(int idProiettore, int capienza, String nomeAula,
            String edificio) {
        this.idProiettore = idProiettore;
        this.capienza = capienza;
        this.nomeAula = nomeAula;
        this.edificio = edificio;
    }
    public int getIdProiettore() {
        return idProiettore;
    }
    public void setIdProiettore(int idProiettore) {
        this.idProiettore = idProiettore;
    }
    public int getCapienza() {
        return capienza;
    }
    public void setCapienza(int capienza) {
        this.capienza = capienza;
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
    
}
