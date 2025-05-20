package com.divya.demo.core.util;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0,b=1;
        System.out.println(a);
        System.out.println(b);
        while(b<=n){
            int t = a;
            a=b;
            b=t+b;
            System.out.println(b);
        }
    }
}
