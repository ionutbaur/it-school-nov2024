package com.itschool.session12.homework.ex1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setFirstName("Ionutz");
        student1.setCnp(12345L);
        student1.setSex("M");

        Professor mathProfessor = new Professor();
        mathProfessor.setFirstName("Prof de mate");

        Course math = new Course(); // cursul de mate are un profesor - Prof de mate
        // si un student - Ionutz
        math.setName("Math");
        System.out.println(math);

        System.out.println("Course name is: " + math.getName());
        math.setProfessor(mathProfessor);
        math.setStudents(new ArrayList<>());
        math.getStudents().add(student1);

        Student student2 = new Student();
        student2.setFirstName("Alex");
        math.getStudents().add(student2);
        //

        Professor englishProfessor = new Professor();
        englishProfessor.setFirstName("Prof de engleza");

        Course english = new Course();
        english.setName("English");
        english.setProfessor(englishProfessor);
        english.setStudents(new ArrayList<>());
        english.getStudents().add(student1);

        List<Course> courses = new ArrayList<>();
        courses.add(math);
        courses.add(english);

        for (Course course : courses) {
            System.out.println(course);
        }

        List<String> ionutzCourses = new ArrayList<>();
        for (Course course : courses) {
            for (Student student : course.getStudents()) {
                if ("Ionutz".equals(student.getFirstName())) {
                    ionutzCourses.add(course.getName());
                }
            }
        }

        System.out.println(student1.getFirstName() + " has the courses: " + ionutzCourses);
    }
}
