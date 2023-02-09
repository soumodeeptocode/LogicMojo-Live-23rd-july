package com.java.logicmojo.aggregation;

import java.util.ArrayList;
import java.util.List;

public class Sports {
    public static void main(String[] args) {
        //create sports person//
        SportPerson sp1 = new SportPerson("Dhoni");
        SportPerson sp2 = new SportPerson("Kohli");
        SportPerson sp3 = new SportPerson("Sachin");

        //create country//
        Country india = new Country("India");

        List<SportPerson> sportPersonList= new ArrayList<>();

        sportPersonList.add(sp1);
        sportPersonList.add(sp2);
        sportPersonList.add(sp3);

        //assign the players to th country//
        india.setSportsPerson(sportPersonList);

        System.out.println("The players from country "+india.getName() + " are "+india.getSportPersons());
    }
}
