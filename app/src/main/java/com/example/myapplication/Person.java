package com.example.myapplication;

public class Person {
    public Person(String login, String pass, String name) {
        this.login = login;
        this.pass = pass;
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public String getPass() {
        return pass;
    }

    public String getName() {
        return name;
    }

    private String login;
    private String pass;
    private String name;

}
