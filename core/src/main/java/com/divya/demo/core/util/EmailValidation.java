package com.divya.demo.core.util;

import java.util.Scanner;

public class EmailValidation{
    public static void main(String[] args) {
        String pattern = "^[a-z]{1,6}[_]{0,1}[0-9]{0,4}@hackerrank\\.com$";
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=0;i<n;i++){
            String s = scanner.next();
            if(s.matches(pattern)){
                System.out.println("True");
            }else{
                System.out.println("False");
            }
        }
    }
}