package com.divya.demo.core.util.structuraldp.facadeDP;

import com.divya.demo.core.util.structuraldp.facadeDP.subsystems.Notification;
import com.divya.demo.core.util.structuraldp.facadeDP.subsystems.Payment;
import com.divya.demo.core.util.structuraldp.facadeDP.subsystems.Product;

public class PlaceOrderFacade {

    Product product;
    Payment payment;
    Notification notification;

    PlaceOrderFacade(){
        this.product = new Product();
        this.payment = new Payment();
        this.notification = new Notification();
    }
    void createOrder(){
        Product p1 = product.getProduct();
        payment.getPaymentDetails();
        notification.getNotification();
    }
}
