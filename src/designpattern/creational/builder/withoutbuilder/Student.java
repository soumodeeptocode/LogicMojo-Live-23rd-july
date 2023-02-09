package designpattern.creational.builder.withoutbuilder;

import java.util.List;

public class Student {
    int rollnumber;  //mandatory
    int age; //optional
    String name; //op
    String fatherName; //op
    String motherName; //op
    List<String> subject; //op
    String mobileNumber; //op

    public Student(int rollnumber, int age, String name, String fatherName, String motherName, List<String> subject, String mobileNumber) {
        this.rollnumber = rollnumber;
        this.age = age;
        this.name = name;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.subject = subject;
        this.mobileNumber = mobileNumber;
    }

    public Student(int _rollnumber, String _name){
        this.rollnumber = _rollnumber;
        this.name = _name;
    }

    public Student(int _rollNumber, String _fatherName, String _motherName){
        this.rollnumber = _rollNumber;
        this.fatherName = _fatherName;
        this.mobileNumber = _motherName;
    }

//    public Student(int _rollNumber, String _fatherName, String _motherName){
//        this.rollnumber = _rollNumber;
//        this.fatherName = _fatherName;
//        this.mobileNumber = _motherName;
//    }

}
