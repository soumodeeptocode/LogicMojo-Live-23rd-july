package designpattern.creational.builder.withbuilder;

public class Client {
    public static void main(String[] args) {
        Director director1 = new Director(new EnggStudentBuilder());
        Director director2 = new Director(new MBAStudentBuilder());

        Student enggStudent = director1.createStudent();
        Student mbaStudent = director2.createStudent();

        System.out.println(enggStudent.toString());
        System.out.println(mbaStudent.toString());
    }
}
