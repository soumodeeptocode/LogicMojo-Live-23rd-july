package designpattern.creational.builder.withbuilder;

import java.util.List;


public abstract class StudentBuilder {
    int rollnumber;  //mandatory
    int age; //optional
    String name; //op
    List<String> subject; //op
    String mobileNumber; //op

    public StudentBuilder setRoolNumber(int _rollnumber){
        this.rollnumber = _rollnumber;
        return this;
    }

    public StudentBuilder setAge(int _age){
        this.age = _age;
        return this;
    }

    public StudentBuilder setName(String _name){
        this.name = _name;
        return this;
    }

    public StudentBuilder setMobileNUmber(String _mobileNumber){
        this.mobileNumber = _mobileNumber;
        return this;
    }

    public abstract StudentBuilder setSubject();

    public Student build(){
        return new Student(this);
    }

}



