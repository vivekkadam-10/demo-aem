package com.divya.demo.core.util.structuraldp.decoratorDP;

public class DecoratorClient {
    public static void main(String[] args) {

        //Extra cheese margarita
        BasePizza pizza = new ExtraCheese(new Margarita());
        System.out.println("Option 1 cost : " + pizza.cost());

        //Extra cheese, extra olives veg delight pizza
        BasePizza pizza1 = new ExtraCheese(new ExtraOlives(new VegDelight()));
        System.out.println("Option 2 cost : " + pizza1.cost());

    }
}
