package gestione.orari.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import gestione.orari.entita.OrarioDidattico;

public class OrarioDidatticoController {

	// just to avoid code duplicates
	private SessionFactory startSession() {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(OrarioDidattico.class).buildSessionFactory();
		return factory;
	}

	/**
	 * creates and insert a new OrarioDidattico in the DB, checks that LocalDateTime
	 * is appropriate, launch LocalDateTimeException otherwise
	 */
	public void createSchedule(int idOrarioDidattico, LocalDateTime giornoOraInizio, LocalDateTime giornoOraFine,
			int idLezione) {

		try {

			if ((LocalDateTime.now().isAfter(giornoOraInizio)) || (giornoOraInizio.isAfter(giornoOraFine)))
				throw new LocalDateTimeException("Controllare i giorni");

		} catch (LocalDateTimeException e) {
			System.out.println(e.getMessage());
		}

		SessionFactory factory = startSession();

		Session session = factory.getCurrentSession();

		try {

			OrarioDidattico tempSchedule = new OrarioDidattico(idOrarioDidattico, giornoOraInizio, giornoOraFine,
					idLezione);

			session.beginTransaction();

			session.save(tempSchedule);

			session.getTransaction().commit();

		} finally {
			factory.close();
		}
	}

	/** get OrarioDidattico by ID */
	public OrarioDidattico getScheduleByID(int idOrarioDidattico) {

		SessionFactory factory = startSession();

		Session session = factory.getCurrentSession();

		try {

			session.beginTransaction();

			OrarioDidattico tempSchedule = session.get(OrarioDidattico.class, idOrarioDidattico);

			session.getTransaction().commit();

			return tempSchedule;

		} finally {
			factory.close();
		}
	}

	/** get all occurrences of the table OrarioDisattico */
	public List getAllSchedule() {

		SessionFactory factory = startSession();

		Session session = factory.getCurrentSession();

		List<OrarioDidattico> list;
		try {
			session.beginTransaction();

			list = session.createQuery("from OrarioDidattico").getResultList();

		} finally {
			factory.close();
		}
		return list;
	}

	/**
	 * update giornoOraInizio && giornoOraFine, check that LocalDateTime is
	 * appropriate, launch LocalDateTimeException otherwise
	 */
	public void updateSchedule(int idOrarioDidattico, LocalDateTime giornoOraInizio, LocalDateTime giornoOraFine) {

		SessionFactory factory = startSession();

		Session session = factory.getCurrentSession();

		try {
			session.beginTransaction();

			OrarioDidattico tempSchedule = session.get(OrarioDidattico.class, idOrarioDidattico);

			if ((LocalDateTime.now().isAfter(giornoOraInizio)) || LocalDateTime.now().isAfter(giornoOraFine)
					|| (giornoOraInizio.isAfter(giornoOraFine)))
				throw new LocalDateTimeException("Controlla le date");

			tempSchedule.setGiornoOraInizio(giornoOraInizio);
			tempSchedule.setGiornoOraFine(giornoOraFine);

			session.getTransaction().commit();

		} catch (LocalDateTimeException e) {
			System.out.println(e.getMessage());
		} finally {
			factory.close();
		}
	}

	/** update idLezione */
	public void updateLessonID(int idOrarioDidattico, int idLezione) {

		SessionFactory factory = startSession();

		Session session = factory.getCurrentSession();
		try {
			session.beginTransaction();

			OrarioDidattico tempSchedule = session.get(OrarioDidattico.class, idOrarioDidattico);

			tempSchedule.setIdLezione(idLezione);

			session.getTransaction().commit();

		} finally {
			factory.close();
		}
	}

	/** delete an OrarioDidattico with a specific ID */
	public void DeleteSchedule(int idOrarioDidattico) {

		SessionFactory factory = startSession();

		Session session = factory.getCurrentSession();
		try {
			session.beginTransaction();

			OrarioDidattico tempSchedule = session.get(OrarioDidattico.class, idOrarioDidattico);

			session.delete(tempSchedule);

			session.getTransaction().commit();

		} finally {
			factory.close();
		}
	}

//	/** delete all OrarioDidattico */
//	public void DeleteAllSchedule() {
//
//		SessionFactory factory = startSession();
//
//		Session session = factory.getCurrentSession();
//		int idOrarioDidattico = 9;
//
//		try {
//			while (tempSchedule != null) {
//				session.beginTransaction();
//				OrarioDidattico tempSchedule = session.get(OrarioDidattico.class, idOrarioDidattico);
//				session.getTransaction().commit();
//
//				DeleteSchedule(idOrarioDidattico);
//			}
//
//		} finally {
//			factory.close();
//		}
//
//	}

}