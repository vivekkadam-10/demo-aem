package com.divya.demo.core.util.structuraldp.decoratorDP;

public abstract class BasePizza {

    abstract int cost();
}

class Margarita extends BasePizza {
    int cost(){
        return 100;
    }
}

class VegDelight extends BasePizza {
    int cost(){
        return 150;
    }
}

//Decorator
abstract class Toppings extends BasePizza{
}

class ExtraCheese extends Toppings{
    BasePizza bp;

    ExtraCheese(BasePizza bp){
        this.bp = bp;
    }
    int cost(){
        return bp.cost()+30;
    }
}
class ExtraOlives extends Toppings{
    BasePizza bp;

    ExtraOlives(BasePizza bp){
        this.bp = bp;
    }
    int cost(){
        return bp.cost()+20;
    }
}