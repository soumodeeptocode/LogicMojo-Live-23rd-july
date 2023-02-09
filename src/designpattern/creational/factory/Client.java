package designpattern.creational.factory;

public class Client {
    public static void main(String[] args) {
        MedineFactory medineFactory = new MedineFactory();

        Medicine medicine = medineFactory.getMedicine("FUNGAL");
        medicine.manufacture();
    }
}
