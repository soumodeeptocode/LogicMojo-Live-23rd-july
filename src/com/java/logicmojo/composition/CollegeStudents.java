package com.java.logicmojo.composition;

public class CollegeStudents {
    public static void main(String[] args) {
        College college = new College("DEF");
        college.setStudentList();

        System.out.println("The students studying in "+ college.getName() + " are "+college.getStudents());
    }
    }

