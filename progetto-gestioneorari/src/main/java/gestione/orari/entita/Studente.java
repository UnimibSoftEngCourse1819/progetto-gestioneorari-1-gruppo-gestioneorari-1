package gestione.orari.entita;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Studente")
public class Studente {

    @Id
    @Column
    private int matricola;

    @Column
    private long telefono;

    @Column
    private String nome;

    @Column
    private String cognome;

    @Column
    private String email;

    public Studente(int matricola, long telefono, String nome, String cognome,
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

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
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
