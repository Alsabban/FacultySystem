package com.company;

//import GUI.IDandPasswords;
import GUI.Login;
import GUI.LoginPage;
import System.Course;
import System.SystemData;
import Users.Professor;
import Users.Student;

import javax.swing.*;

public class Main {

    public static void main(String[] args)  {
            String awards[]={"1st ahaha","2nd lol"};
            Student s1 = new Student("Ammar",19,"01090987197","ammarmoataz@gmail.com");
            Student s2 = new Student("AmmASDar",19,"010909287197","ammarmoatZaz@gmail.com");
            Student s3 = new Student("AmmASDar",19,"010909287197","ammarmoatZaz@gmail.com");
            Professor p1= new Professor("Gamal",50,"0126678051","gamalhaha@hotmail.com",1990, awards,awards);
            Course c1 = new Course("de7k",3);
            Course c2 = new Course("le3b",4);
            Course c3 = new Course("kos",2);
            p1.assignGrade(s1,2.45F);
            p1.assignGrade(s1,3.0F);
            p1.assignGrade(s1,3.7F);

            Login login = new Login();
            login.setVisible(true);
            login.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            System.out.println(s1.getCourses());
            for(int i=0;i<s1.getCourses().size();i++){
                    System.out.println(s1.getCourses().get(i).getName());
            }

            //   IDandPasswords idandPasswords = new IDandPasswords();

             //  LoginPage loginPage = new LoginPage(idandPasswords.getLoginInfo());




    }
}
