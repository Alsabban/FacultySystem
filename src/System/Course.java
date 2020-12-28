package System;

import Users.Professor;
import Users.Student;

import java.util.ArrayList;

public class Course {
    private String name;
    private static ArrayList<Student> students = new ArrayList<Student>();
    private static Professor professor;
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

    public static ArrayList<Student> getStudents() {
        return students;
    }

    public static Professor getProfessor() {
        return professor;
    }

    public static void setStudents(ArrayList<Student> students) {
        Course.students = students;
    }

    public static void setProfessor(Professor professor) {
        Course.professor = professor;
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
