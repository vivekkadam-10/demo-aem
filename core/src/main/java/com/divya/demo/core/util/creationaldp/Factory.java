package com.divya.demo.core.util.creationaldp;

//Problem - There are many objects and if in future if there is change in logic of obj creation
//then we will have to change all objects where it is created using 'new'.
// This strong dependency makes the code hard to maintain or update.

//Solution - Create a factory class which will be responsible for all the obj creations.
// Separation of creational logic, maintainablity improves
public class Factory {
    public static void main(String[] args) {
        ShapeFactory sf = new ShapeFactory();
        Shape shape = sf.getShapeInstance("Circle");
        shape.computeArea();
    }
}
interface Shape{
    public void computeArea();
}
class Circle implements Shape{
    @Override
    public void computeArea(){
        System.out.println("Circle area");
    }
}
class Rectangle implements Shape{
    @Override
    public void computeArea(){
        System.out.println("Rectangle    area");
    }
}

// Factory responsible for obj creation. Change only  in one class in future
class ShapeFactory{
    public Shape getShapeInstance(String val){
        if(val.equals("Circle")){
            return new Circle();
        }else if(val.equals("Rectangle")){
            return new Rectangle();
        }
        return null;
    }
}