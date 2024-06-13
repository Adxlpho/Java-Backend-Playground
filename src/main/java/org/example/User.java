package org.example;

import java.util.List;

public abstract class User {
    private String _name;
    private String _membership = "Bronze";
    boolean _verified = false;

    void set_verified(boolean verified) {
        _verified = verified;
    }

    boolean get_verified() {
        return _verified;
    }

    public static List<User> admins;

    void verify() {
        System.out.println("Verifying...");
        set_verified(true);
    }

    public static void print_admins_names() {
        for (User u : admins) {
            System.out.println(u.get_name());
        }
    }

    public User(String name) {
        set_name(name);
    }

    public String toString() {
        return get_name() + " " + get_membership();
    }

    public User() {
    }

    public User(String name, String membership) {
        set_name(name);;
        set_membership(membership);
    }

    void set_name(String name) {
        _name = name;
    }

    String get_name() {
        return _name;
    }

    void set_membership(String membership) {
        _membership = membership;
    }

    void set_membership(Membership membership) {
        _membership = membership.name();
    }

    public enum Membership {
        Bronze, Silver, Gold
    }

    String get_membership() {
        return _membership;
    }
}

