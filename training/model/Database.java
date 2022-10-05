package org.training.model;


import java.util.ArrayList;
import java.util.List;

public class Database {
    private static List<Class> classes = new ArrayList<Class>();
    private static List<School> schools = new ArrayList<School>();
    private static List<Person> people = new ArrayList<>();

    public static void initDb() {
        classes.add(new Class(1,"matematyka",List.of(1)));
        classes.add(new Class(2, "fizyka",List.of(1)));
        classes.add(new Class(3, "biologia",List.of(2)));
        classes.add(new Class(4, "chemia",List.of(2)));
        classes.add(new Class(5, "angielski",List.of(3)));
        classes.add(new Class(6, "francuski",List.of(3)));
        classes.add(new Class(7, "polski",List.of(4)));
        classes.add(new Class(8, "historia",List.of(14)));

        schools.add(new School(111, "Koper"));
        schools.add(new School(222, "Koper"));
        schools.add(new School(333, "Konopa"));
        schools.add(new School(444, "Paderewa"));

        people.add(new Person("Bartek", 25, "Twojstary@gmail",List.of(1,2)));
        people.add(new Person("Zosia", 22, "Twojastar@gmail.com",List.of(3,4)));
        people.add(new Person("Maciek", 24, "rura@yahoo.pl",List.of(5,6)));
        people.add(new Person("Michał", 26, "ruraaa@yahoo.pl",List.of(7,8)));

        System.out.println(people);
        System.out.println(schools.get(3));


    }
    public static List<Class> getClasses() {
        return classes;
    }

    public static void setClasses(List<Class> classes) {
        Database.classes = classes;
    }

    public static List<School> getSchools() {
        return schools;
    }

    public static void setSchools(List<School> schools) {
        Database.schools = schools;
    }

    public static List<Person> getPeople() {
        return people;
    }

    public static void setPeople(List<Person> people) {
        Database.people = people;
    }
}
