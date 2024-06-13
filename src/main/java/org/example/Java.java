package org.example;

import java.util.ArrayList;
import java.util.List;

public class Java {
    public static void main(String[] args) {
        Student s = new Student();
        s.set_name("Student");
        Teacher t = new Teacher();
        t.set_name("Teacher");

        User.admins = new ArrayList<User>();
        User.admins.add(s);
        User.admins.add(t);
        
        for (User u : User.admins) {
            u.verify();
        }
    }
}