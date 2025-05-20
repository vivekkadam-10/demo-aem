package com.divya.demo.core.util;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        while(m!=n){
            if(m<n){
                n = n-m;
            }else {
                m = m-n;
            }
        }
        System.out.println(m);
    }
}
