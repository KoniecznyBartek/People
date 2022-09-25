package org.training.model;

public class Person {

    private String name;
    private int age;
    private String mail;

    public Person(String n, int a, String m) {
        this.name = n;
        this.age = a;
        this.mail = m;
    }


    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

    public String getMail() {
        return this.mail;
    }

    public void setMail(String m) {
        this.mail = m;
    }

    public String toString() {
        return this.name + " " + this.age +" "+ this.mail;
    }


}
