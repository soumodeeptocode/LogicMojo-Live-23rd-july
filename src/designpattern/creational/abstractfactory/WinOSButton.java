package designpattern.creational.abstractfactory;

public class WinOSButton implements Button{
    @Override
    public void paint() {
        System.out.println("We have created windows button");
    }
}
