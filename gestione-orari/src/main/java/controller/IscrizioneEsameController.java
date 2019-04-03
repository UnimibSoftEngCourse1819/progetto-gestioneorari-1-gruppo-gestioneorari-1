package controller;


import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.IscrizioneEsame;


public class IscrizioneEsameController {
	private SessionFactory startSession() {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(IscrizioneEsame.class).buildSessionFactory();
		return factory;
	}	
	/**
	 * creates and insert a new IscrizioneEsame in the DB, checks that
	 * LocalDateTime is appropriate
	 */
	public void insert(int idIscrizioneEsame,int idEsame, int idProfessore, LocalDateTime giornoOra, LocalDateTime scadenzaLimiteIscrizione, int idStudente) {
		System.out.println("insert esame start");
		try {
			System.out.println("insert esame try start");
			//today < dataEsame
			//controlli su data esame che deve essere > limite scadenza. 
			//limite scadenza -> 48 ore prima dell'esame
			
			System.out.println("insert esame try end");
	} catch (Exception e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
       // session.getTransaction().rollback();
	}
		SessionFactory factory = startSession();
		Session session = factory.getCurrentSession();

		try {
			System.out.println("insert esame try2 start");
			IscrizioneEsame iscEsame = new IscrizioneEsame(idIscrizioneEsame, idEsame, idProfessore, giornoOra, scadenzaLimiteIscrizione, idStudente);

			session.beginTransaction();
			session.save(iscEsame);
			session.getTransaction().commit();
			System.out.println("insert esame try2 end");
		}catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
          //  session.getTransaction().rollback();
		} finally {
			factory.close();
		}
	}
	


	/** get IscrizioneEsame by ID */
	public IscrizioneEsame selectByID(int idIscrizioneEsame) {
		System.out.println("selectById iscrizioneEsame start");
		SessionFactory factory = startSession();
		Session session = factory.getCurrentSession();
		IscrizioneEsame iscEsa = null;
		try {
			System.out.println("selectById try start");
			session.beginTransaction();
			iscEsa = session.get(IscrizioneEsame.class, idIscrizioneEsame);
			session.getTransaction().commit();
			System.out.println("selectById try end");
			
			return iscEsa;
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
            session.getTransaction().rollback();
           
		} finally {
			factory.close();
		}
		return iscEsa;
	}

	/** get all occurrences of the table IscrizioneEsame */
	public List selectAll() {
		System.out.println("selecAll esame start");
		SessionFactory factory = startSession();
		Session session = factory.getCurrentSession();
		List<IscrizioneEsame> list = null;
		
		try {
			System.out.println("selecAll try esame start");
			session.beginTransaction();
			list = session.createQuery("from IscrizioneEsame").getResultList();
			System.out.println("selecAll try esame end");
		} catch (Exception e) {
		
			e.printStackTrace();
            session.getTransaction().rollback();
		} finally {
			factory.close();
		}
		return list;
	}

	/** update IscrizioneEsame */
	public void update(int idIscrizioneEsame,int idEsame, int idProfessore, LocalDateTime giornoOra, LocalDateTime scadenzaLimiteIscrizione, int idStudente) {
		System.out.println("update esame start");
		SessionFactory factory = startSession();
		Session session = factory.getCurrentSession();
		
		try {
			System.out.println("update try esame start");
			session.beginTransaction();
			IscrizioneEsame iscEsa = session.get(IscrizioneEsame.class, idIscrizioneEsame);
			iscEsa.setIdEsame(idEsame);
			iscEsa.setIdProfessore(idProfessore);
			iscEsa.setGiornoOra(giornoOra);
			iscEsa.setScadenzaLimiteIscrizione(scadenzaLimiteIscrizione);
			iscEsa.setIdStudente(idStudente);		
			session.getTransaction().commit();
			System.out.println("update try esame end");

		}catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
	     //   session.getTransaction().rollback();
		} finally {
			factory.close();
		}
	}


	/** delete an IscrizioneEsame with a specific ID */
	public void deleteById(int idIscrizioneEsame) {
		System.out.println("deleteById esame start");
		SessionFactory factory = startSession();
		Session session = factory.getCurrentSession();
		
		try {
			System.out.println("deleteById try esame start");
			session.beginTransaction();
			IscrizioneEsame iscEsa = session.get(IscrizioneEsame.class, idIscrizioneEsame);
			session.delete(iscEsa);
			session.getTransaction().commit();
			System.out.println("deleteById try esame end");
		}catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
	      //  session.getTransaction().rollback();
		} finally {
			factory.close();
		}
	}

}




	
