package model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Calendar")
public class Calendar {

	@Id
	@Column(name = "CalendarID")
	private int CalendarID;

	@Column(name = "year")
	private String year; // es. 2018-2019

	@Column(name = "begin")
	private LocalDateTime begin;

	@Column(name = "end")
	private LocalDateTime end;

	public Calendar() {
	};

	public Calendar(int CalendarID, String year, LocalDateTime begin, LocalDateTime end) {
		this.CalendarID = CalendarID;
		this.year = year;
		this.begin = begin;
		this.end = end;
	}

	public int getCalendarID() {
		return CalendarID;
	}

	public void setCalendarID(int CalendarID) {
		this.CalendarID = CalendarID;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public LocalDateTime getBegin() {
		return begin;
	}

	public void setBegin(LocalDateTime begin) {
		this.begin = begin;
	}

	public LocalDateTime getEnd() {
		return end;
	}

	public void setEnd(LocalDateTime end) {
		this.end = end;
	}

}
