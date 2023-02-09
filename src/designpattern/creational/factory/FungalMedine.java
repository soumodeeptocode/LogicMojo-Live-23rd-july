package designpattern.creational.factory;

public class FungalMedine implements Medicine{
    @Override
    public void manufacture() {
        System.out.println("It manufactures fungal medicine");
    }
}
