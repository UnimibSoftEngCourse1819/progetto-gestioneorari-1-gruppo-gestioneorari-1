package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CorsoDiLaurea")
public class CorsoDiLaurea {
    
    @Id
    @Column
    private int idCorsoDiLaurea;
    @Column
    private String nome;
    @Column
    private String descrizione;
    @Column
    private int durata; 
    @Column
    private String tipologia;
    
    public CorsoDiLaurea() {}
    
    public CorsoDiLaurea(int idCorsoDiLaurea, String nome, String descrizione, int durata, String tipologia) {
        this.idCorsoDiLaurea = idCorsoDiLaurea;
        this.durata = durata;
        this.nome = nome;
        this.descrizione = descrizione;
        this.tipologia = tipologia;
    }
    public int getIdCorsoDiLaurea() {
        return idCorsoDiLaurea;
    }
    public void setIdCorsoDiLaurea(int idCorsoDiLaurea) {
        this.idCorsoDiLaurea = idCorsoDiLaurea;
    }
    public int getDurata() {
        return durata;
    }
    public void setDurata(int durata) {
        this.durata = durata;
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
    public String getTipologia() {
        return tipologia;
    }
    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }
    @Override
   	public String toString() {
   		StringBuilder sb = new StringBuilder();
   		sb.append("idCorsoDiLaurea: ").append(idCorsoDiLaurea);
   		sb.append("nome: ").append(nome);
   		sb.append("descrizione: ").append(descrizione);
   		sb.append("durata: ").append(durata);	
   		sb.append("tipologia: ").append(tipologia);
   		return sb.toString();
   	}
    
}
