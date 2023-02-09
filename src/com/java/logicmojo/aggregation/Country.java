package com.java.logicmojo.aggregation;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Country {
    private String name;
    List<SportPerson> sportPersons;

    public Country(String _name){
        this.name = _name;
    }

    public String getName(){
        return this.name;
    }
    public void setSportsPerson(List<SportPerson> _sportPersons){
        this.sportPersons = _sportPersons;
    }

    public List<String> getSportPersons(){
        List<String> sportPersonsName = new ArrayList<>();

        for(SportPerson sportPerson: this.sportPersons){
            sportPersonsName.add(sportPerson.getName());
        }
        return sportPersonsName;
    }
}
