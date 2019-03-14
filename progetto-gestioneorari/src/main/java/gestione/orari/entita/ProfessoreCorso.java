package gestione.orari.entita;

public class ProfessoreCorso {
   private int idProfessoreCorso, idCorso, idProfessore;

    public ProfessoreCorso(int idProfessoreCorso, int idCorso,
            int idProfessore) {
        this.idProfessoreCorso = idProfessoreCorso;
        this.idCorso = idCorso;
        this.idProfessore = idProfessore;
    }

    public int getIdProfessoreCorso() {
        return idProfessoreCorso;
    }

    public void setIdProfessoreCorso(int idProfessoreCorso) {
        this.idProfessoreCorso = idProfessoreCorso;
    }

    public int getIdCorso() {
        return idCorso;
    }

    public void setIdCorso(int idCorso) {
        this.idCorso = idCorso;
    }

    public int getIdProfessore() {
        return idProfessore;
    }

    public void setIdProfessore(int idProfessore) {
        this.idProfessore = idProfessore;
    }
    

}
