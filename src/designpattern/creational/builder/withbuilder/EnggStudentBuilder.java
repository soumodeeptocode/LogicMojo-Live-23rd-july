package designpattern.creational.builder.withbuilder;

import java.util.ArrayList;
import java.util.List;

public class EnggStudentBuilder extends StudentBuilder{
    @Override
    public StudentBuilder setSubject() {
        List<String> subjects = new ArrayList<>();
        subjects.add("DSA");
        subjects.add("OS");
        subjects.add("DBMS");
        this.subject= subjects;
        return this;
    }
}
