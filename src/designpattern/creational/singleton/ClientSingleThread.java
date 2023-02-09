package designpattern.creational.singleton;

public class ClientSingleThread {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance("ConnectionString");

        Singleton anotherInstance = Singleton.getInstance("AnotherConnectionString");

        System.out.println(instance.value);
        System.out.println(anotherInstance.value);
    }
}
