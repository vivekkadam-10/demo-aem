package com.divya.demo.core.util.behavioraldp.stateDP;

import lombok.Getter;

public class Product {

    @Getter
    String name;
    @Getter
    int code;
    @Getter
    int cost;

    Product(String name, int cost, int code){
        this.name = name;
        this.code = code;
        this.cost = cost;
     }
}
