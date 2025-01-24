package com.itschool.session12.homework.ex1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.firstName = "Ionutz";
        student1.cnp = 12345L;

        Professor mathProfessor = new Professor();
        mathProfessor.firstName = "Prof de mate";

        Course math = new Course(); // cursul de mate are un profesor - Prof de mate
        // si un student - Ionutz
        math.name = "Math";
        math.professor = mathProfessor;
        math.students = new ArrayList<>();
        math.students.add(student1);

        Student student2 = new Student();
        student2.firstName = "Alex";
        math.students.add(student2);
        //

        Professor englishProfessor = new Professor();
        englishProfessor.firstName = "Prof de engleza";

        Course english = new Course();
        english.name = "English";
        english.professor = englishProfessor;
        english.students = new ArrayList<>();
        english.students.add(student1);

        List<Course> courses = new ArrayList<>();
        courses.add(math);
        courses.add(english);

        /*for (Course course : courses) {
            System.out.println(course);
        }*/

        List<String> ionutzCourses = new ArrayList<>();
        for (Course course : courses) {
            for (Student student : course.students) {
                if ("Ionutz".equals(student.firstName)) {
                    ionutzCourses.add(course.name);
                }
            }
        }

        System.out.println(student1.firstName + " has the courses: " + ionutzCourses);
    }
}
