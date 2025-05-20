package com.divya.demo.core.util.creationaldp;

import java.util.List;

//Builder pattern creates the object step-by-step.
//We have a builder class where all the builder methods are defined
// In each of these methods we will return builder obj ( this is partial product) and a build method
//This build method will return final product
//We have one director class which decides the order in which builder methods will be called
//To be used in case of complex object creation
public class Builder {

    public static void main(String[] args) {
        Director d = new Director(new EngineeringStudent());
        Student1 s1 = d.createStudent();
        System.out.println(s1.toString());

        Director d2 = new Director(new MBAStudent());
        Student1 s2 = d2.createStudent();
        System.out.println(s2.toString());
    }
}

class Director{
    StudentBuilder studentBuilder;

    Director(StudentBuilder sb){
        this.studentBuilder = sb;
    }

    public Student1 createStudent(){
        if(studentBuilder instanceof EngineeringStudent) {
            return createEngineeringStudent();
        } else if(studentBuilder instanceof MBAStudent){
            return createMbaStudent();
        }
        return null;
    }

    Student1 createEngineeringStudent(){
        //step by step -> build the product (order is decided here)
        return studentBuilder.setId(1).setFname("Divya").setLname("chavan").setSubjects().build();
    }

    Student1 createMbaStudent(){
        return studentBuilder.setId(2).setFname("arnav").setLname("chavan").setSubjects().build();
    }
}

class Student1{
    int id;
    String fname;
    String lname;
    List<Subject> subjects;

    Student1(StudentBuilder sb) {
        this.id = sb.id;
        this.fname = sb.fname;
        this.lname = sb.lname;
        this.subjects = sb.subjects;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}
class Subject{
    String name;

    Subject(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                '}';
    }
}

abstract class StudentBuilder{

    int id;
    String fname;
    String lname;
    List<Subject> subjects;

    StudentBuilder setId(int id){
        this.id = id;
        return this;
    }
    StudentBuilder setFname(String fname){
        this.fname = fname;
        return this;
    }
    StudentBuilder setLname(String lname){
        this.lname = lname;
        return this;
    }
    abstract StudentBuilder setSubjects();

    Student1 build(){
        return new Student1(this);
    }
}

class EngineeringStudent extends StudentBuilder{

    @Override
    StudentBuilder setSubjects() {
        this.subjects = List.of(new Subject("Maths"));
        return this;
    }
}

class MBAStudent extends StudentBuilder{

    @Override
    StudentBuilder setSubjects() {
        this.subjects = List.of(new Subject("Analytics"));
        return this;
    }
}