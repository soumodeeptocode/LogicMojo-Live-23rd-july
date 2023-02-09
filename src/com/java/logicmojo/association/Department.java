package com.java.logicmojo.association;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Professor> staff;

    Department(String _name){
        this.name = _name;
    }

    public String getName() {
        return name;
    }

    //Assign the staff//
    public void setStaff(List<Professor> _staff){
        this.staff = _staff;
    }

    //retrieve the list of professor names working for a department//
    public List<String> getStaff(){
        List<String> proffNames = new ArrayList<>();

        for(Professor professor: this.staff){
            proffNames.add(professor.getName());
        }
        return proffNames;
    }


}
