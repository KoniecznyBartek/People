package org.training.model;


import java.util.List;

public class Schools {
    private int id;
    private String name;
    private List<Integer> classesId;
    public Schools(int id, String name, List<Integer> classesId){
        this.id = id;
        this.name = name;
        this.classesId = classesId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getClassesId() {
        return classesId;
    }

    public void setClassesId(List<Integer> classesId) {
        this.classesId = classesId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        id = id;
    }
}



