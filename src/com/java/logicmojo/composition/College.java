package com.java.logicmojo.composition;

import java.util.ArrayList;
import java.util.List;

public class College {
    private String name;
    List<Student> studentList;

    public College(String _name){
        this.name = _name;
    }

    public void setStudentList(){
        //create students//
        Student stud1 = new Student("XYZ");
        Student stud2 = new Student("ABC");
        Student stud3 = new Student("MNO");
        List<Student> students = new ArrayList<>();
        students.add(stud1);
        students.add(stud2);
        students.add(stud3);
        this.studentList = students;
    }

    public List<String> getStudents(){
        List<String> studentsName = new ArrayList<>();
        for(Student student: this.studentList){
            studentsName.add(student.getName());
        }
        return studentsName;
    }

    public String getName(){
        return this.name;
    }
}
