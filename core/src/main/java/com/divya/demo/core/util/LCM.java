package com.divya.demo.core.util;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        // find largest of 2 numbers which can be LCM in some cases
        int large = Math.max(m, n);
        if(large%m==0 && large%n==0){
            System.out.println(large);
        }else{//increment large and keep checking
            while(true) {
                large++;
                if (large % m == 0 && large % n == 0) {
                    System.out.println(large);
                    break;
                }
            }
        }
    }
}
