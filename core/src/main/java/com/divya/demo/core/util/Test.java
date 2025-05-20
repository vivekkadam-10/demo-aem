package com.divya.demo.core.util;

import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) throws IOException {

        List<String> logs = new ArrayList<>();
        logs.add("s4 error");
        logs.add("s1 success");
        logs.add("s2 error");
        logs.add("s2 error");
        logs.add("s3 success");






        int result = Test.countFaults(4, logs);

        System.out.println(result);
    }

    public static int countFaults(int n, List<String> logs) {
        // Write your code here
        int count=0;
        Map<String, Integer> hm= new HashMap<>();
        for(int i=0;i<logs.size();i++){
            String s[] = new String[2];
            s = logs.get(i).split(" ");
            String server = s[0];
            String msg = s[1];
            //System.out.println(msg);
            if(hm.containsKey(server) && msg.equals("error")){
                hm.put(server,hm.get(server)+1);
                if(hm.get(server)==3){
                    System.out.println(server);
                    count++;
                    hm.put(server,0);
                }
            }else if(hm.containsKey(server) && msg.equals("success")){
                hm.put(server,0);
            }else if(!hm.containsKey(server) && msg.equals("error")){
                //System.out.println("true");
                hm.put(server, 1);
            }

        }

        return count;
    }
}
