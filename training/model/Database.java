package org.training.model;


import java.util.ArrayList;
import java.util.List;

public class Database {
    private static List<Classes> people = new ArrayList<Classes>();
    private static List<Schools> classes = new ArrayList<Schools>();

    public static void initDb() {
        people.add(new Classes(1, "matematyka"));
        people.add(new Classes(2, "polski"));
        people.add(new Classes(3, "biologia"));
        people.add(new Classes(4, "geografia"));

        classes.add(new Schools(111,"Micek",List.of(1)));
        classes.add(new Schools(222, "Koper",List.of(3,2)));
    }
    public static List<Classes> getPerson() {
        return people;
    }

    public static void setPerson(List<Classes> person) {
        Database.people = person;
    }

    public static List<Schools> getClasses() {
        return classes;
    }

    public static void setClasses(List<Schools> classes) {
        Database.classes = classes;
    }


}
