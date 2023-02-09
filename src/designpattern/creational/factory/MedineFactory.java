package designpattern.creational.factory;

public class MedineFactory {

    Medicine getMedicine(String input){

        switch (input){
            case "VIRAL":
                return new ViralMedicine();
            case "BACTERIAL":
                return new BacterialMedicine();
            case "FUNGAL":
                return new FungalMedine();
            default:
                return null;
        }
    }
}


