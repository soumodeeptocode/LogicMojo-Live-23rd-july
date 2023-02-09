package designpattern.creational.abstractfactory;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WinOSButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WinOSCheckBox();
    }
}
