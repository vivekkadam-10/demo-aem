package com.divya.demo.core.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) throws IOException {
        List<Integer> l = new ArrayList<>();
        l.add(-4);
        l.add(-3);l.add(0);l.add(2);l.add(1);


        System.out.println(Result.maxMeetings(l));
    }
}
class Result {

    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static int maxMeetings(List<Integer> effectiveness) {
        // Write your code here
        effectiveness = effectiveness.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        int count =0;
        for(Integer i:effectiveness){
            if(i>0){
                break;
            }
            count++;
        }
        System.out.println(count);
        int sum =0;
        for(int i=count;i<effectiveness.size();i++){
            sum+=effectiveness.get(i);
        }
        System.out.println(sum);
        int fcount = effectiveness.size()-count;
        if(count<=0){
            return count;
        }else {
            for (int i = count-1; i >= 0; i--) {
                if (sum + effectiveness.get(i) > 0) {
                    fcount++;
                } else {
                    break;
                }
            }
            return fcount;
        }
    }

}
