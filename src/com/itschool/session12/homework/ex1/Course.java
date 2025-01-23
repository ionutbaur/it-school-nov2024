package com.itschool.session12.homework.ex1;

import java.util.List;

public class Course {

    String name;
    String schedule;
    int duration;
    String description;
    Professor professor;
    List<Student> students;

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
