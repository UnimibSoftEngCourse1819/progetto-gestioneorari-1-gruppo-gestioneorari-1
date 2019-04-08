package model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Timetable")
public class Timetable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int timetableID;

    @Column
    private LocalDateTime fromDate;

    @Column
    private LocalDateTime toDate;

    @Column
    private int courseID;

    public Timetable() {
    };

    public Timetable(int timetableID, int courseID, LocalDateTime fromDate, LocalDateTime toDate) {
	this.timetableID = timetableID;
	this.fromDate = fromDate;
	this.toDate = toDate;
	this.courseID = courseID;
    }

    public int getTimetableID() {
	return timetableID;
    }

    public void setTimetableID(int timetableID) {
	this.timetableID = timetableID;
    }

    public LocalDateTime getFromDate() {
	return fromDate;
    }

    public void setFromDate(LocalDateTime fromDate) {
	this.fromDate = fromDate;
    }

    public LocalDateTime getToDate() {
	return toDate;
    }

    public void setToDate(LocalDateTime toDate) {
	this.toDate = toDate;
    }

    public int getCourseID() {
	return courseID;
    }

    public void setCourseID(int courseID) {
	this.courseID = courseID;
    }

    @Override
    public String toString() {

	return ("timetable " + timetableID + ": " + fromDate + "|" + toDate + "|" + courseID);
    }

}
