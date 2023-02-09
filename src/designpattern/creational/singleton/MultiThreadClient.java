package designpattern.creational.singleton;

public class MultiThreadClient {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new ThreadConnection1()); //Decorator Pattern//
        Thread thread2= new Thread(new ThreadConnection2());

        thread1.start();
        thread2.start();
    }

    static class ThreadConnection1 implements Runnable{

        @Override
        public void run() {
            SingletonThreadSafe instance1 = SingletonThreadSafe.getInstance("ConnectionString");
            System.out.println(instance1.value);
        }
    }

    static class ThreadConnection2 implements Runnable{

        @Override
        public void run() {
            SingletonThreadSafe instance2 = SingletonThreadSafe.getInstance("AnotherConnectionString");
            System.out.println(instance2.value);
        }
    }
}
