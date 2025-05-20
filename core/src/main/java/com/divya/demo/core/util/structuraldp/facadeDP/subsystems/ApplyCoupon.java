package com.divya.demo.core.util.structuraldp.facadeDP.subsystems;
//This subsystem is not used in our facade class
public class ApplyCoupon {

    public boolean applyCoupon(String code){
        if(!code.isEmpty()){
            System.out.println("Coupon code applied successfully");
            return true;
        }
        System.out.println("Coupon not valid");
        return false;
    }
}
