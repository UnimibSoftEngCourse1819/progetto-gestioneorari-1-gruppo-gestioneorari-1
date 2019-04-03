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

	public LocalDateTime getfromDate() {
		return fromDate;
	}

	public void setfromDate(LocalDateTime fromDate) {
		this.fromDate = fromDate;
	}

	public LocalDateTime gettoDate() {
		return toDate;
	}

	public void settoDate(LocalDateTime toDate) {
		this.toDate = toDate;
	}

	public int getcourseID() {
		return courseID;
	}

	public void setcourseID(int courseID) {
		this.courseID = courseID;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("timetableID: ").append(timetableID);
		sb.append("fromDate: ").append(fromDate);
		sb.append("toDate: ").append(toDate);
		sb.append("courseID: ").append(courseID);
		return sb.toString();
	}

}
