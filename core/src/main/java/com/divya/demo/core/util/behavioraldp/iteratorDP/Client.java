package com.divya.demo.core.util.behavioraldp.iteratorDP;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        //Collections class is agregator
        //ArrayList is implementing agregator interface and create Iter() object

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);


        //Iterator class is iterator
        //Iter implements Iterator class which provides logic for hasNext and next

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
