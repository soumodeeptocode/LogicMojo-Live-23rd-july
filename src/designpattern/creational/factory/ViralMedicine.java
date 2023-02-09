package designpattern.creational.factory;


public class ViralMedicine implements Medicine{
    @Override
    public void manufacture() {
        System.out.println("It manufactures viral medicines");
    }
}
