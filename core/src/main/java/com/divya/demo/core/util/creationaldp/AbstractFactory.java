package com.divya.demo.core.util.creationaldp;

// This is factory of factory - used when we have multiple related types of objs
// Create parent factory class and factory interface,this interface is implemented by factory classes of each of the subclasses
//No need to have if else logic for object creation. Instead use it as below.
public class AbstractFactory {

    public static void main(String[] args) {
        ParentFactory pf = new ParentFactory();
        AbstarctShapeFactory asf = pf.getFactory("Circle");
        asf.getShapInstance().computeArea();
    }
}
class ParentFactory {
    AbstarctShapeFactory getFactory(String val){
        if(val.equals("Circle")){
            return new CircleFactory();
        }else if(val.equals("Rectangle")){
            return new RectangleFactory();
        }
        return null;
    }
}
interface AbstarctShapeFactory{
    Shape getShapInstance();
}

class CircleFactory implements AbstarctShapeFactory {

    @Override
    public Shape getShapInstance() {
        return new Circle();
    }
}

class RectangleFactory implements AbstarctShapeFactory {

    @Override
    public Shape getShapInstance() {
        return new Rectangle();
    }
}