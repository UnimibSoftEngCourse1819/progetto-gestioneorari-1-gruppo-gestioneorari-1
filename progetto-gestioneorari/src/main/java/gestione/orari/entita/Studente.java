package gestione.orari.entita;

public class Studente {
    private int matricola, telefono;
    private String nome, cognome, email;
    public Studente(int matricola, int telefono, String nome, String cognome,
            String email) {
        this.matricola = matricola;
        this.telefono = telefono;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
    }
    public int getMatricola() {
        return matricola;
    }
    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
