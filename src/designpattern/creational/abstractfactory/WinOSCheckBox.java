package designpattern.creational.abstractfactory;

public class WinOSCheckBox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("We have created Win Checkbox");
    }
}
