package org.example;

public class Teacher extends User {
    public Teacher() {
    }

    void verify() {
        System.out.println("Verifying through phone");
        set_verified(true);
    }
}
