package com.divya.demo.core.util.behavioraldp.strategyDP;

public class Item {
    String name;
    int cost;

    Item(String name, int cost){
        this.name = name;
        this.cost = cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
