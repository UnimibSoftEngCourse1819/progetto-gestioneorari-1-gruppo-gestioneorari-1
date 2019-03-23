package gestione.orari.entita;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Risorsa")
public class Risorsa {
    
    @Id
    @Column
    private int idRisorsa;
    
    
    @Column
    private int idTipologiaRisorsa;
    
    @Column
    private String nome;
    
    @Column
    private String descrizione;
    
    
    @Column
    private String commento;
    
    
    
    
}
