package designpattern.creational.abstractfactory;

public class MacOSCheckBox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("We have created Mac OS Checkbox");
    }
}
