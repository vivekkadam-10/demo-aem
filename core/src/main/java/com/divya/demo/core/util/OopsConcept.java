package com.divya.demo.core.util;


import java.util.*;
import java.util.stream.Collectors;

public class OopsConcept {

    public static void main(String[] args) {
        //Object - real world entity
        //Its basic unit of Object oriented programming
        Person p1 = new Person();
        p1.name = "Anuj";
        p1.age = 25;
        p1.walk();
        p1.eat();

        Person p2 = new Person();
        p2.name = "Divya";
        p2.age = 29;
        p2.walk(1000);

        Person d1 = new Developer(29,"XYZ");
        d1.walk();

        System.out.println("Static Method Overridding :");
        d1.sleep();

        Car c = new Audi();
        c.start();
        c.breaking();
        //Diamond problem
        Vehicle v = new Audi();
        v.run();
        int[] arr={1,3,5,7,3,2};
        List<Integer> r = new ArrayList<>();

        String a ="1101";
        ArrayList<Integer>[] vals = new ArrayList[10];
        vals[1] = new ArrayList<>();
        vals[1].add(0);
        //vals[0].remove(9);

        Set<Integer> rs = new HashSet();
        Iterator it = rs.iterator();
        int res[]=new int[rs.size()];

        Map<Character, Character> mp=new HashMap();
        mp.put('s','s');
        int m=Integer.MAX_VALUE;
        Set<String> set=new HashSet();
        set.add("sfds");
        Map<String,Integer> hm=new HashMap();
        hm.put("s",1);
        hm.get("s");
        for (Map.Entry<String,Integer> h:hm.entrySet()) {
            System.out.println("PRINT"+h.getValue());
        }
        String s="asdasdaa";
        s = s.replaceFirst("a","");
        System.out.println(s);
        List<Character> list = new ArrayList();
        list.sort(Comparator.reverseOrder());
        Set<String> anas=new HashSet();
        anas.iterator();
        Set<Map.Entry<String, Integer>> e = hm.entrySet();
        String xcc="asda;dsaf;asd";
        Arrays.stream(xcc.split(";")).collect(Collectors.toList());
        hm.put("",23);
        List<String> l=new ArrayList();

        s="test";
        s=s.substring(0,s.length()-1);
        System.out.println(s);
        list.sort(Comparator.naturalOrder());
        char[] carr=new char[10];
        Arrays.sort(arr);
        int are[]= new int[10];
        int t = (int) Math.sqrt(10);
        int n[]=new int[]{2,7,9,3,1};
        System.out.println(Arrays.toString(Arrays.copyOfRange(n,0,3)));
        int x = -Integer.MAX_VALUE;
        System.out.println( Math.max(0,0));
        System.out.println("List");












    }


}
//Blueprint of the object
//The class represents a group of objects having similar properties and behavior.
class Person{

    //Encapsulation - Hiding data for security reasons
    //Private, default/package, protected, public
    //Use Getter and Setters public and variables private
    protected String name;
    int age;

    Person(){
        System.out.println("Person created");
    }

    Person(int age, String name){
        this();
        this.age = age;
        this.name = name;
    }

    // Compile time polymorphism : walk method different args and return types
    // Method overloading
    // Different return type will not be considered overloading as it will cause confusion to compiler
    void walk(){
        System.out.println(name + " is walking");
    }
    void walk(int steps){
        System.out.println(name + " walked"+ steps + " steps");
    }

    void eat(){
        System.out.println(name + "is eating");
    }

    static void sleep(){
        System.out.println("Sleeping Person");
    }
}
class Developer extends Person{
    public Developer(int age, String name){
        super(age,name);
    }

    //Runtime Polymorphism : same walk method in both the classes but its decided in run time which one to call
    //Method Overriding
    void walk(){
        System.out.println("Developer "+name + " is walking");
    }

    //Static methods are not overloaded becoz they are class specific
    //Even variables are not polymorphic
    static void sleep(){
        System.out.println("Sleeping Developer");
    }
}

//Complete Abstraction
abstract class Car{
    int price;
    abstract void start();

    //Abstract class is can have method implementations. Unlike Interfaces which are strictly not allowed to have implementation.
    //Multiple inheritance is not supported - One class cannot have multiple parents(Diamond problem) thats why we have interfaces.
   //Interface solves the diamond problem as it does not have any implementations.
    void breaking() {
        System.out.println("Car is Breaking");
    }
}

class Audi extends Car implements Vehicle,Automobile{

    @Override
    void start() {
        System.out.println("Audi is starting");
    }

    void breaking() {
        System.out.println("Audi is Breaking");
    }

    //if removed will get compile time error - Diamond problem
    @Override
    public void run() {
        Vehicle.super.run();
    }
}
//Diamond problem
interface Vehicle {
    default void run() {
        System.out.println("Vehicle is running");
    }
}
interface Automobile {
    default void run() {
        System.out.println("Automobile is running");
    }
}

