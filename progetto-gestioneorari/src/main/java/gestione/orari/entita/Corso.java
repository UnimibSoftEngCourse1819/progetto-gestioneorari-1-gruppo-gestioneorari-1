package gestione.orari.entita;

public class Corso {

    private int idCorso, idCorsoDiLaurea, annoDiCorso;
    private String nome, descrizione;
    public Corso(int idCorso, int idCorsoDiLaurea, int annoDiCorso, String nome,
            String descrizione) {
        this.idCorso = idCorso;
        this.idCorsoDiLaurea = idCorsoDiLaurea;
        this.annoDiCorso = annoDiCorso;
        this.nome = nome;
        this.descrizione = descrizione;
    }
    public int getIdCorso() {
        return idCorso;
    }
    public void setIdCorso(int idCorso) {
        this.idCorso = idCorso;
    }
    public int getIdCorsoDiLaurea() {
        return idCorsoDiLaurea;
    }
    public void setIdCorsoDiLaurea(int idCorsoDiLaurea) {
        this.idCorsoDiLaurea = idCorsoDiLaurea;
    }
    public int getAnnoDiCorso() {
        return annoDiCorso;
    }
    public void setAnnoDiCorso(int annoDiCorso) {
        this.annoDiCorso = annoDiCorso;
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
    
}
