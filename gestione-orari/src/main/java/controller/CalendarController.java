package controller;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Calendar;

public class CalendarController {

    private SessionFactory startSession() {

	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Calendar.class)
		.buildSessionFactory();
	return factory;

    }

    /**
     * creates and insert a new Calendar in the DB, checks that LocalDateTime is
     * appropriate, launch LocalDateTimeException otherwise
     */
    public void createCalendar(int CalendarID, String year, LocalDateTime begin, LocalDateTime end) {

	try {

	    if ((LocalDateTime.now().isAfter(begin)) || (begin.isAfter(end)))
		throw new LocalDateTimeException(
			"Inizio periodo antecedente alla data attuale o successivo alla data di fine");

	    SessionFactory factory = startSession();

	    Session session = factory.getCurrentSession();

	    try {
		Calendar tempCalendar = new Calendar(CalendarID, year, begin, end);

		session.beginTransaction();

		session.save(tempCalendar);

		session.getTransaction().commit();

	    } finally {
		factory.close();
	    }
	} catch (LocalDateTimeException e) {
	    System.out.println(e.getMessage());
	}
    }

    /** get Calendar by ID */
    public Calendar getCalendarByID(int CalendarID) {

	SessionFactory factory = startSession();

	Session session = factory.getCurrentSession();

	try {
	    session.beginTransaction();

	    Calendar tempCalendar = session.get(Calendar.class, CalendarID);

	    session.getTransaction().commit();

	    return tempCalendar;

	} finally {
	    factory.close();
	}
    }

    /** get all occurrences of the table CalendarioDisattico */
    public List getAllCalendar() {

	SessionFactory factory = startSession();

	Session session = factory.getCurrentSession();

	List<Calendar> list;
	try {
	    session.beginTransaction();

	    list = session.createQuery("from Calendar").getResultList();
	} finally {
	    factory.close();
	}
	return list;
    }

    /** update year */
    public void updateCalendarYear(int CalendarID, String year) {

	SessionFactory factory = startSession();

	Session session = factory.getCurrentSession();
	try {
	    session.beginTransaction();

	    Calendar tempCalendar = session.get(Calendar.class, CalendarID);

	    tempCalendar.setYear(year);

	    session.getTransaction().commit();

	} finally {
	    factory.close();
	}
    }

    /**
     * update giornoOraInizio && giornoOraFine, check that LocalDateTime is
     * appropriate, launch LocalDateTimeException otherwise
     */
    public void updateCalendar(int CalendarID, LocalDateTime begin, LocalDateTime end) {

	SessionFactory factory = startSession();

	Session session = factory.getCurrentSession();
	try {
	    session.beginTransaction();

	    Calendar tempCalendar = session.get(Calendar.class, CalendarID);

	    if ((LocalDateTime.now().isAfter(begin)) || (LocalDateTime.now().isAfter(end)) || (begin.isAfter(end)))
		throw new LocalDateTimeException("Controlla le DATE!");

	    tempCalendar.setBegin(begin);
	    tempCalendar.setEnd(end);

	    session.getTransaction().commit();

	} catch (LocalDateTimeException e) {
	    System.out.println(e.getMessage());

	} finally {
	    factory.close();
	}
    }

    public void updateCalendar(int CalendarID, String year, LocalDateTime begin, LocalDateTime end) {

	SessionFactory factory = startSession();

	Session session = factory.getCurrentSession();

	try {
	    session.beginTransaction();

	    Calendar tempCalendar = session.get(Calendar.class, CalendarID);

	    if ((LocalDateTime.now().isAfter(begin)) || (LocalDateTime.now().isAfter(end)) || (begin.isAfter(end)))
		throw new LocalDateTimeException("Controlla le DATE!");

	    tempCalendar.setYear(year);
	    tempCalendar.setBegin(begin);
	    tempCalendar.setEnd(end);

	    session.getTransaction().commit();

	} catch (LocalDateTimeException e) {
	    System.out.println(e.getMessage());

	} finally {
	    factory.close();
	}
    }

    /** delete an Calendar with a specific ID */
    public void DeleteCalendar(int CalendarID) {

	SessionFactory factory = startSession();

	Session session = factory.getCurrentSession();
	try {
	    session.beginTransaction();

	    Calendar tempCalendar = session.get(Calendar.class, CalendarID);

	    session.delete(tempCalendar);

	    session.getTransaction().commit();

	} finally {
	    factory.close();
	}
    }

}