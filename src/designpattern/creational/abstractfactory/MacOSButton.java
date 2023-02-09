package designpattern.creational.abstractfactory;

public class MacOSButton implements Button{
    @Override
    public void paint() {
        System.out.println("We have created Mac OS button");
    }
}
