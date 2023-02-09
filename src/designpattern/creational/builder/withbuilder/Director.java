package designpattern.creational.builder.withbuilder;

public class Director {
    StudentBuilder studentBuilder;

    public Director(StudentBuilder _studentBuilder){
        this.studentBuilder = _studentBuilder;
    }

    public Student createStudent(){
        if(studentBuilder instanceof EnggStudentBuilder){
            return createEnggStudent();
        }else if(studentBuilder instanceof MBAStudentBuilder){
            return createMBAStudent();
        }else {
            return null;
        }
    }

    private Student createEnggStudent(){
        return studentBuilder.setRoolNumber(1).setAge(18).setName("XYZ").setSubject().build();
    }

    private Student createMBAStudent(){
        return studentBuilder.setRoolNumber(2).setName("ABC").setSubject().build();
    }
}
