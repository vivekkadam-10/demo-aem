package com.divya.demo.core.util;

import java.util.Arrays;

public class InternalWorkingHashMap {

    public static void main(String[] args) {
        //HashMap uses Hash function to store the data in Hashtable
        //Hashtable is array of nodes
        //All Operations are O(1)
        //In case of collision O(1+n); n= size of linked list
        //Node has - key, val, hash , next (node)
        //Hash function - > returns same value for given input; but can return that same output for multiple inputs
        //Hash Example - % modulus function
        //https://www.youtube.com/watch?v=wZLn2BN1TvY
        HashNode node[] = new HashNode[10];

        int values[] = {3,10,87,65,24,22,96};

        node = putEle(3,node);
        node = putEle(65,node);
        for (int i=0;i<10;i++){
            System.out.println(node[i]);
        }
        System.out.println(getEle(65,node));

    }
    static HashNode[] putEle(int value, HashNode[] node){
        int hash = value % 3;
        com.divya.demo.core.util.HashNode n = new HashNode();
        if(node[hash]==null) {
            n.hash = hash;
            n.key = value;
            n.val = value;
            node[hash] = n;
        }else { //collision - In this case linked list is created. To optimize in java 8 after some threshold binary tree is created.
            n.hash = hash;
            n.key = value;
            n.val = value;
            HashNode collide = node[hash];
            collide.next = n;
        }
        return node;
    }
    static int getEle(int key, HashNode[] node){
        int hash = key % 3;
        if(node[hash]==null)
            return 0;
        else if(node[hash].key==key){
            return node[hash].val;
        }else if(node[hash].next!=null){ // collision
            HashNode firstListNode = node[hash].next;
            for(int i=0;firstListNode.next!=null;i++){
                if(firstListNode.next.key == key){
                    return firstListNode.val;
                }else {
                    firstListNode = node[hash].next;
                }
            }
        }
        return 0;
    }
}
class HashNode{
    int val;
    int key;
    int hash;
    HashNode next;
    HashNode(){

    }

}
