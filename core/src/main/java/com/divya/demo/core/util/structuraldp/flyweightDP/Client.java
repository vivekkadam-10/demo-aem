package com.divya.demo.core.util.structuraldp.flyweightDP;

public class Client {
    public static void main(String[] args) {

        ILetter obj1 = LetterFactory.createLetter('d');
        obj1.display(10,11);

        ILetter obj2 = LetterFactory.createLetter('d');
        obj1.display(11,12);

        System.out.println(obj1==obj2);

        ILetter obj3 = LetterFactory.createLetter('i');
        obj1.display(12,13);

        System.out.println(obj1==obj3);
    }
}
