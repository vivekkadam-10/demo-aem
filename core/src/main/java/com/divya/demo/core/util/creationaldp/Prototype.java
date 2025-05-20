package com.divya.demo.core.util.creationaldp;

//creational design pattern
// Used to create clones of the object when the creation of base object is very expensive
//Problem - When we create a clone of obj in base class then there might be one field which is
//private so we cannot access it. Second problem is main class don't know which fields are mandatory
//and which are optionals. - To solve these we have Prototype design pattern

//Solution - cloning should be responsibility of base class and not client. For this we create a
// prototype interface and concrete classes will provide their own cloning logic.
public class Prototype {

    Student s = new Student(1,"Divya",29);
    Student clonedS = (Student) s.clone();
}

interface PrototypeI{
    PrototypeI clone();
}

class Student implements PrototypeI{

    int id;
    String name;
    int age;


    Student(int id, String name, int age){
        this.name = name;
        this.id = id;
        this.age = age;
    }

    @Override
    public PrototypeI clone() {
        return new Student(id,name,age);
    }
}

