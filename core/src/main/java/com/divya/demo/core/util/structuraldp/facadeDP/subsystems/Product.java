package com.divya.demo.core.util.structuraldp.facadeDP.subsystems;

public class Product {

    public Product getProduct(){
        System.out.println("New Product created");
        return new Product();
    }
}
