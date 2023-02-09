package com.java.logicmojo.association;

import java.util.ArrayList;
import java.util.List;

public class College {
    public static void main(String[] args) {
        //create professors//
        Professor prof1= new Professor("xyz");
        Professor prof2 = new Professor("ABC");

        //create a department//
        Department cse = new Department("CSE");

        List<Professor> cseStaff = new ArrayList<>();
        cseStaff.add(prof1);
        cseStaff.add(prof2);


        //Assign professors to dept//
        cse.setStaff(cseStaff);

        System.out.println("The staff of department "+ cse.getName() + " is: "+cse.getStaff());
    }
}
