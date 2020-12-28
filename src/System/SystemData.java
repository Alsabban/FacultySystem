package System;

import Users.Professor;
import Users.Student;

import java.util.ArrayList;
import java.util.HashMap;

public class SystemData {
    public static ArrayList<Course> courses=new ArrayList<Course>();
    public static ArrayList<Student> students=new ArrayList<Student>();
    public static ArrayList<Professor> professors=new ArrayList<Professor>();
    public static HashMap<String,String> logininfo = new HashMap<String,String>();

    public static ArrayList<Course> getCourses() {
        return courses;
    }

    public static ArrayList<Student> getStudents() {
        return students;
    }

    public static ArrayList<Professor> getProfessors() {
        return professors;
    }
    public HashMap getLoginInfo(){
        return logininfo;
    }


}
