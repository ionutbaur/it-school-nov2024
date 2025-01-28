package com.itschool.session12.homework.ex1;

import java.util.List;

public class Course {

    private String name;
    private String schedule;
    private int duration;
    private String description;
    private Professor professor;
    private List<Student> students;
    private boolean isHappiness;

    public Course() {
    }

    public Course(String name,
                  String schedule,
                  int duration,
                  String description,
                  Professor professor,
                  List<Student> students) {
        this.name = name;
        this.schedule = schedule;
        this.duration = duration;
        this.description = description;
        this.professor = professor;
        this.students = students;
    }

    public boolean isHappiness() {
        return isHappiness;
    }

    public void setHappiness(boolean happiness) {
        isHappiness = happiness;
    }

    public void setName(String name) {
        if ("ionutz".equals(name)) {
            System.out.println("Teapa!!!");
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        if (duration < 0) {
            System.out.println("Duration cannot be negative. It won't be set.");
        } else {
            this.duration = duration;
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", schedule='" + schedule + '\'' +
                ", duration=" + duration +
                ", description='" + description + '\'' +
                ", professor=" + professor +
                ", students=" + students +
                '}';
    }
}
