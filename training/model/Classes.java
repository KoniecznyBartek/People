package org.training.model;

import java.util.ArrayList;
import java.util.List;

public class Classes {

    private int classesId;
    private String className;
    private List<Integer> schools;

    public  Classes (int classesId, String className){
        this.classesId=classesId;
        this.className = className;
    }

    public int getClassId() {
        return classesId;
    }

    public void setClassId(int classId) {
        this.classesId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
