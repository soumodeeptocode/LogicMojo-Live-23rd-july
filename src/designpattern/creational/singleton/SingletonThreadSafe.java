package designpattern.creational.singleton;

public class SingletonThreadSafe {

    private static volatile SingletonThreadSafe instance;

    public String value;

    private SingletonThreadSafe(String _value){
        this.value = _value;
    }

    public static SingletonThreadSafe getInstance(String value){
        SingletonThreadSafe resultInstance = instance;
        if(resultInstance != null){
            return resultInstance;
        }
        synchronized (SingletonThreadSafe.class){
            if(instance == null){
                instance = new SingletonThreadSafe(value);
            }
            return instance;
        }
    }


}
