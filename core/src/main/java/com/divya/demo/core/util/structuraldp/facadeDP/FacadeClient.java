package com.divya.demo.core.util.structuraldp.facadeDP;

public class FacadeClient {
    public static void main(String[] args) {
        PlaceOrderFacade placeOrderFacade = new PlaceOrderFacade();
        placeOrderFacade.createOrder();
        //If anything internally is changed in order creation process, client will not be affected by it.
    }
}
