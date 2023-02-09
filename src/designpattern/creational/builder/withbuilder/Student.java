package designpattern.creational.builder.withbuilder;

import java.util.List;

public class Student {
    int rollnumber;  //mandatory
    int age; //optional
    String name; //op
    List<String> subject; //op
    String mobileNumber; //op

    public Student(StudentBuilder builder){
        this.rollnumber = builder.rollnumber;
        this.age = builder.age;
        this.name = builder.name;
        this.subject = builder.subject;
        this.mobileNumber = builder.mobileNumber;
    }

    public String toString(){
        return ""+ " roll number: " +this.rollnumber +
                " age: "+this.age +
                " name: "+this.name +
                " subjects: "+this.subject.get(0) + ", "+ this.subject.get(1) +", " + this.subject.get(2);
    }
}
