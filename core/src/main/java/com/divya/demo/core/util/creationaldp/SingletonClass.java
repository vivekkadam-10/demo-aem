package com.divya.demo.core.util.creationaldp;

//class whose one instance can be created at any given time in JVM
public class SingletonClass {
    int field;

    //instance variable priavte static
    //This lazy way to create singleton
    private static SingletonClass instance;
    //we can also create the instance using synchronized keyword to below static method
    //we can also create the instance using double locking as example below
    /*public static SingletonClass getInstance(){
        if(instance==null) {
            synchronized (SingletonClass.class) {
                instance = new SingletonClass();

            }
        }
        return instance;
    }*/


    //private constructor
    private SingletonClass(){
    }

    //method to return only one obj all time
    public static SingletonClass getInstance(){
        if(instance==null)
            instance = new SingletonClass();
        return instance;
    }

    public int getField() {
        return field;
    }

    public void setField(int field) {
        this.field = field;
    }

    @Override
    public String toString() {
        return "SingeltonClass{" +
                "field=" + field +
                '}';
    }
}
class SingletonTest {

    public static void main(String[] args) {
        // Get the singleton instance
        SingletonClass singleton1 = SingletonClass.getInstance();
        SingletonClass singleton2 = SingletonClass.getInstance();
        singleton1.setField(10);
        singleton2.setField(20);
        // Check if both instances are the same
        System.out.println(singleton1 == singleton2); // Output: true
        System.out.println(singleton1);
        System.out.println(singleton2);
    }
}
//Examples - Logging, DB connections, managing thread pool,
// caching data, single point of access to global settings/variables