package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Timetable {
    private LocalDateTime start;
    private LocalDateTime end;
    private String classroomID;
    private String courseName;
    private String professor;

    public Timetable() {   }

    public Timetable(String start, String end, String classroomID, String courseName, String professor) {
        this.start = LocalDateTime.of(LocalDate.parse(start.substring(0, 10)), LocalTime.parse(start.substring(11)));
        this.end = LocalDateTime.of(LocalDate.parse(end.substring(0, 10)), LocalTime.parse(end.substring(11)));
        this.classroomID = classroomID;
        this.courseName = courseName;
        this.professor = professor;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public String getClassroomID() {
        return classroomID;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getProfessor() {
        return professor;
    }

    @Override
    public String toString() {
        return "Timetable{" +
                "start=" + start +
                ", end=" + end +
                ", classroomID='" + classroomID + '\'' +
                ", courseName='" + courseName + '\'' +
                ", professor='" + professor + '\'' +
                '}';
    }
}
