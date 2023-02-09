package designpattern.creational.factory;

public class BacterialMedicine implements Medicine{
    @Override
    public void manufacture() {
        System.out.println("It manufactures Bacterial Medicine");
    }
}
