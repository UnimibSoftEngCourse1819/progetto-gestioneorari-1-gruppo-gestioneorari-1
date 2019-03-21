package gestione.orari.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import gestione.orari.entita.CalendarioDidattico;

public class CalendarioDidatticoController {

    private SessionFactory startSession() {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(CalendarioDidattico.class)
                .buildSessionFactory();
        return factory;

    }
    
    /**
     * creates and insert a new CalendarioDidattico in the DB, checks that LocalDateTime is
     * appropriate, launch LocalDateTimeException otherwise
     */
    public void createCalendar(int idCalendarioDidattico, int idSegretario,
            String nomeAnno, LocalDateTime inizioPeriodo,
            LocalDateTime finePeriodo) throws LocalDateTimeException {

        try {

            if ((LocalDateTime.now().isAfter(inizioPeriodo))
                    || (inizioPeriodo.isAfter(finePeriodo)))
                throw new LocalDateTimeException(
                        "Inizio periodo antecedente alla data attuale o successivo alla data di fine");

        } catch (LocalDateTimeException e) {
            System.out.println(e.getMessage());
        }

        SessionFactory factory = startSession();

        Session session = factory.getCurrentSession();

        try {
            CalendarioDidattico tempCalendar = new CalendarioDidattico(
                    idCalendarioDidattico, idSegretario, nomeAnno,
                    inizioPeriodo, finePeriodo);

            session.beginTransaction();

            session.save(tempCalendar);

            session.getTransaction().commit();

        } finally {
            factory.close();
        }
    }
    
    /** get CalendarioDidattico by ID */
    public CalendarioDidattico getCalendarByID(int idCalendarioDidattico) {

        SessionFactory factory = startSession();

        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();

            CalendarioDidattico tempCalendar = session
                    .get(CalendarioDidattico.class, idCalendarioDidattico);

            session.getTransaction().commit();

            return tempCalendar;

        } finally {
            factory.close();
        }
    }
    
    /** get all occurrences of the table CalendarioDisattico*/
    public List getAllCalendar() {

        SessionFactory factory = startSession();

        Session session = factory.getCurrentSession();

        List<CalendarioDidattico> list;
        try {
            list = session.createQuery("from CalendarioDidattico")
                    .getResultList();
        } finally {
            factory.close();
        }
        return list;
    }
    
    /** update nomeAnno */
    public void updateCalendarName(int idCalendarioDidattico, String nomeAnno) {

        SessionFactory factory = startSession();

        Session session = factory.getCurrentSession();
        try {
            session.beginTransaction();

            CalendarioDidattico tempCalendar = session
                    .get(CalendarioDidattico.class, idCalendarioDidattico);

            tempCalendar.setNomeAnno(nomeAnno);

            session.getTransaction().commit();

        } finally {
            factory.close();
        }
    }
    
    /** update inizioPeriodo, check that LocalDateTime is
     * appropriate, launch LocalDateTimeException otherwise
     */
    public void updateCalendarStart(int idCalendarioDidattico,
            LocalDateTime inizioPeriodo) throws LocalDateTimeException {

        SessionFactory factory = startSession();

        Session session = factory.getCurrentSession();
        try {
            session.beginTransaction();

            CalendarioDidattico tempCalendar = session
                    .get(CalendarioDidattico.class, idCalendarioDidattico);

            if ((LocalDateTime.now().isAfter(inizioPeriodo))
                    || (inizioPeriodo.isAfter(tempCalendar.getFinePeriodo())))
                throw new LocalDateTimeException(
                        "Inizio periodo antecedente alla data attuale o successivo alla data di fine");

            tempCalendar.setInizioPeriodo(inizioPeriodo);

            session.getTransaction().commit();

        } catch (LocalDateTimeException e) {
            System.out.println(e.getMessage());

        } finally {
            factory.close();
        }
    }
    
    /** update finePeriodo, check that LocalDateTime is
     * appropriate, launch LocalDateTimeException otherwise
     */
    public void updateCalendarEnd(int idCalendarioDidattico,
            LocalDateTime finePeriodo) throws LocalDateTimeException {

        SessionFactory factory = startSession();

        Session session = factory.getCurrentSession();
        try {
            session.beginTransaction();

            CalendarioDidattico tempCalendar = session
                    .get(CalendarioDidattico.class, idCalendarioDidattico);

            if ((LocalDateTime.now().isAfter(finePeriodo))
                    || (tempCalendar.getInizioPeriodo().isAfter(finePeriodo)))
                throw new LocalDateTimeException(
                        "Fine periodo antecedente alla data attuale o successivo alla data di inizio");

            tempCalendar.setFinePeriodo(finePeriodo);

            session.getTransaction().commit();

        } catch (LocalDateTimeException e) {
            System.out.println(e.getMessage());

        } finally {
            factory.close();
        }
    }
    
    /**delete an CalendarioDidattico with a specific ID */
    public void DeleteCalendar(int idCalendarioDidattico) {

        SessionFactory factory = startSession();

        Session session = factory.getCurrentSession();
        try {
            session.beginTransaction();

            CalendarioDidattico tempCalendar = session
                    .get(CalendarioDidattico.class, idCalendarioDidattico);

            session.delete(tempCalendar);

            session.getTransaction().commit();

        } finally {
            factory.close();
        }
    }

}