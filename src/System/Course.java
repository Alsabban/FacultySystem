package System;

import Users.Professor;
import Users.Student;

import java.util.ArrayList;

public class Course {
    private String name;
    private  ArrayList<Student> students = new ArrayList<Student>();
    private  Professor professor;
    private int creditHours;

    public Course() {

    }

    public Course(String name,int creditHours) {
        this.name = name;
        this.creditHours = creditHours;
        SystemData.getCourses().add(this);
    }

    public String getName() {
        return name;
    }

    public  ArrayList<Student> getStudents() {
        return students;
    }

    public  Professor getProfessor() {
        return professor;
    }



    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }
    public void addStudent(Student student){
        this.students.add(student);
    }
   public void addProfessor(Professor professor){
        this.professor = professor;
    }
}
