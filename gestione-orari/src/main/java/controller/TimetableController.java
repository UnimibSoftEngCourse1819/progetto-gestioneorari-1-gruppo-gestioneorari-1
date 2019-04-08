package controller;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import model.Timetable;

public class TimetableController {

    // just to avoid code duplicates
    private SessionFactory startSession() {

	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Timetable.class)
		.buildSessionFactory();
	return factory;
    }

    private boolean isBetween(LocalDateTime fromDate, LocalDateTime toDate, LocalDateTime begin, LocalDateTime end) {
	boolean res = false;
	if ((fromDate.isAfter(begin)) && (fromDate.isBefore(end)) || (toDate.isAfter(begin)) && (toDate.isBefore(end))
		|| (fromDate.compareTo(begin) == 0) || (toDate.compareTo(end) == 0))
	    ;
	res = true;
	return res;
    }

    /**
     * creates and insert a new Timetable in the DB, checks that LocalDateTime is
     * appropriate, launch LocalDateTimeException otherwise
     */
    public void createTimetable(int timetableID, int courseID, LocalDateTime fromDate, LocalDateTime toDate) {

	try {

	    if ((LocalDateTime.now().isAfter(fromDate)) || (fromDate.isAfter(toDate)))
		throw new LocalDateTimeException("Controllare i giorni");

	    List<Timetable> list = getTimetableByCourse(courseID);

	    for (Timetable element : list) {
		if (this.isBetween(element.getFromDate(), element.getToDate(), fromDate, toDate))
		    throw new LocalDateTimeException("Orario già presente");
	    }

	    SessionFactory factory = startSession();

	    Session session = factory.getCurrentSession();

	    try {

		Timetable tempTimetable = new Timetable(timetableID, courseID, fromDate, toDate);

		session.beginTransaction();

		session.save(tempTimetable);

		session.getTransaction().commit();

	    } finally {
		factory.close();
	    }
	} catch (LocalDateTimeException e) {
	    System.out.println(e.getMessage());
	}

    }

    /** get Timetable by ID */
    public Timetable getTimetableByID(int timetableID) {

	SessionFactory factory = startSession();

	Session session = factory.getCurrentSession();

	try {

	    session.beginTransaction();

	    Timetable tempTimetable = session.get(Timetable.class, timetableID);

	    session.getTransaction().commit();

	    return tempTimetable;

	} finally {
	    factory.close();
	}
    }

    /** get all occurrences of the table Timetable */
    public List getAllTimetable() {

	SessionFactory factory = startSession();

	Session session = factory.getCurrentSession();

	List<Timetable> list;
	try {
	    session.beginTransaction();

	    list = session.createQuery("from Timetable").getResultList();

	} finally {
	    factory.close();
	}

	return list;
    }

    /** get all occurrences of the Timetable by course */
    public List getTimetableByCourse(int courseID) {

	SessionFactory factory = startSession();

	Session session = factory.getCurrentSession();

	List<Timetable> list;
	try {
	    session.beginTransaction();
	    String hql = "FROM Timetable E WHERE E.courseID = :courseID";
	    Query query = session.createQuery(hql);
	    query.setParameter("courseID", courseID);
	    list = query.list();

	} finally {
	    factory.close();
	}
	return list;
    }

    /**
     * update fromDate && toDate, check that LocalDateTime is appropriate, launch
     * LocalDateTimeException otherwise
     */
    public void updateTimetable(int timetableID, LocalDateTime fromDate, LocalDateTime toDate) {

	SessionFactory factory = startSession();

	Session session = factory.getCurrentSession();

	try {
	    session.beginTransaction();

	    Timetable tempTimetable = session.get(Timetable.class, timetableID);

	    if ((LocalDateTime.now().isAfter(fromDate)) || LocalDateTime.now().isAfter(toDate)
		    || (fromDate.isAfter(toDate)))
		throw new LocalDateTimeException("Controlla le date");

	    tempTimetable.setFromDate(fromDate);
	    tempTimetable.setToDate(toDate);

	    session.getTransaction().commit();

	} catch (LocalDateTimeException e) {
	    System.out.println(e.getMessage());
	} finally {
	    factory.close();
	}
    }

    /** update courseID */
    public void updateLessonID(int timetableID, int courseID) {

	SessionFactory factory = startSession();

	Session session = factory.getCurrentSession();
	try {
	    session.beginTransaction();

	    Timetable tempTimetable = session.get(Timetable.class, timetableID);

	    tempTimetable.setCourseID(courseID);

	    session.getTransaction().commit();

	} finally {
	    factory.close();
	}
    }

    /** delete an Timetable with a specific ID */
    public void DeleteTimetable(int timetableID) {

	SessionFactory factory = startSession();

	Session session = factory.getCurrentSession();
	try {
	    session.beginTransaction();

	    Timetable tempTimetable = session.get(Timetable.class, timetableID);

	    session.delete(tempTimetable);

	    session.getTransaction().commit();

	} finally {
	    factory.close();
	}
    }
}
