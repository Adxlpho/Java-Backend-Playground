package org.example;

public class Student extends User {
    void verify() {
        System.out.println("Verifying through phone");
        set_verified(true);
    }
}
