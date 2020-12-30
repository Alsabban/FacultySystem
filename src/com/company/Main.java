package com.company;

//import GUI.IDandPasswords;
import GUI.Login;
import Users.Admin;

import javax.swing.*;

public class Main {

    public static void main(String[] args)  {

Admin admin = new Admin();

            Login login = new Login();
            login.setVisible(true);
            login.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }
}
