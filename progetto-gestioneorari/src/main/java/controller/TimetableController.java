package controller;

import model.Timetable;

import java.io.IOException;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TimetableController {

    private static Connection connection = null;
    private static ArrayList<Timetable> tb = new ArrayList<>();

    //recupera gli orari di tutte le lezioni
    public static ArrayList<Timetable> getAll() {
        try {
            connection = ConnectionManager.getConnection();

            String query = "SELECT timetable.start, timetable.end, timetable.classroom_id, course.name, professor " +
                    "FROM db_orari1.timetable " +
                    "JOIN db_orari1.course " +
                    "ON course.course_id = timetable.course_id ";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery(query);
            while (rs.next()) {
                             tb.add(new Timetable(rs.getString(1),
                                rs.getString(2), rs.getString(3),
                                    rs.getString(4), rs.getString(5)));
                }

        } catch (IOException ex) {
            Logger.getLogger(TimetableController.class.getName()).
                    log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TimetableController.class.getName()).
                    log(Level.SEVERE, null, ex);
        } finally {
            ConnectionManager.closeConnection(connection);
            return tb;
        }
    }

    //inserisce un nuovo orario di lezione
    public static void insertTimetable(LocalDateTime start, LocalDateTime end, String course, String classroomId) {
        try {
            connection = ConnectionManager.getConnection();
            String insertTableSQL = "INSERT INTO db_orari1.timetable"
                    + "(start, end, course_id, classroom_id) VALUES"
                    + "(?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertTableSQL);
            preparedStatement.setTimestamp(1, Timestamp.valueOf(start));
            preparedStatement.setTimestamp(2, Timestamp.valueOf(end));
            preparedStatement.setString(3, course);
            preparedStatement.setString(4, classroomId);
            preparedStatement.executeUpdate();

        } catch (IOException ex) {
            Logger.getLogger(TimetableController.class.getName()).
                    log(Level.SEVERE, null, ex);
        } catch (SQLIntegrityConstraintViolationException ex) {
            System.out.println(ex.getMessage()); //display in a window
        } catch (SQLException ex) {
            Logger.getLogger(TimetableController.class.getName()).
                    log(Level.SEVERE, null, ex);
        } finally {
            ConnectionManager.closeConnection(connection);
        }
    }
}

