package designpattern.creational.abstractfactory;

import java.util.Locale;

public class Client {

    private static Application config(){
        Application app;
        GUIFactory guiFactory;

        String osName = System.getProperty("os.name").toLowerCase();

        if(osName.contains("mac")){
            guiFactory = new MacOSFactory();
        }else {
            guiFactory = new WindowsFactory();
        }

        app = new Application(guiFactory);
        return app;
    }
    public static void main(String[] args) {
        Application app = config();//new Application(new WindowsFactory());
        app.paint();
    }
}
