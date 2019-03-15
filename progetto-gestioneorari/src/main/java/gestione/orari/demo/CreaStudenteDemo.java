package gestione.orari.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import gestione.orari.entita.Studente;

public class CreaStudenteDemo {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Studente.class).buildSessionFactory();
        
        Session session = factory.getCurrentSession();
        
        try {
            Studente tempStudent = new Studente(785154, 338, "Andrea", "Restelli",
            "a.restelli4@campus.unimib.it");
            
            session.beginTransaction();
            System.out.println("begin");
            
            session.save(tempStudent);
            System.out.println("save");
            
            session.getTransaction().commit();
            System.out.println("commit");
            
            System.out.println("done");

        } finally {
            factory.close();
        }

    }

}
