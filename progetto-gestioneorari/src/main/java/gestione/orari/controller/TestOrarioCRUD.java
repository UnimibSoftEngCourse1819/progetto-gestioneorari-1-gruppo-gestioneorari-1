package gestione.orari.controller;

import java.time.LocalDateTime;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import gestione.orari.entita.OrarioDidattico;

public class TestOrarioCRUD {

	public static void main(String[] args) {
	    
	    SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(OrarioDidattico.class).buildSessionFactory();
	    
	    Session session = factory.getCurrentSession();
	    try {
		
     		
    		LocalDateTime giornoOraInizio = LocalDateTime.of(2019,6,8,00,00,00);
    		LocalDateTime giornoOraFine = LocalDateTime.of(2019,7,8,00,00,00);
    		OrarioDidattico tempSchedule = new OrarioDidattico(0, giornoOraInizio, giornoOraFine, 5);
    		
    		session.beginTransaction();
    
            session.save(tempSchedule);
    
            session.getTransaction().commit();
    
        } finally {
            factory.close();
        }
	}

}
