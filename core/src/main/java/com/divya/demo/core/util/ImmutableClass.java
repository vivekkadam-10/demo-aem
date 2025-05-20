package com.divya.demo.core.util;

import java.util.ArrayList;
import java.util.List;

//class final
public final class ImmutableClass {

    //all fields private final
    final private String name;
    final private int id;
    private final List<String> phoneNumbers;
    private final SubClass subClass;

    //parameterized constructor with all fields
    public ImmutableClass(String name, int id, List<String> phoneNumbers, SubClass subClass){
        this.name = name;
        this.id = id;
        this.phoneNumbers = phoneNumbers;
        SubClass s = new SubClass(subClass.getSubId(),subClass.getSubName());
        this.subClass = s;
    }

    //no setters only getter methods
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    //collection
    public List<String> getPhoneNumbers(){
        //return phoneNumbers; --> avoid this return in case of collections
        return new ArrayList<>(phoneNumbers);
    }

    //custom objects
    public SubClass getSubClass() throws CloneNotSupportedException {
        //return subClass; //--> avoid this return clone of custom objects also remember to make
        // this class cloneable (implement Cloneable interface and clone method.
        return (SubClass) subClass.clone();
        //return new SubClass(subClass.getSubId(),subClass.getSubName()); --> this way also it works
    }



    public static void main(String[] args) throws CloneNotSupportedException {
        List<String> l = new ArrayList<>();
        l.add("12131");
        SubClass s = new SubClass(10,"sub");
        ImmutableClass im = new ImmutableClass("Divya",29,l, s);
        im.getPhoneNumbers().add("32423");
        System.out.println(im.getPhoneNumbers());
        im.getSubClass().setSubId(11);
        System.out.println(im.getSubClass());

    }
}

final class SubClass  implements Cloneable{
    private int subId;
    private String subName;

    public SubClass(int subId, String subName) {
        this.subId = subId;
        this.subName = subName;
    }

    public int getSubId() {
        return subId;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubId(int subId) {
        this.subId = subId;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }
    //clone method to make this class cloneable
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "SubClass{" +
                "subId=" + subId +
                ", subName='" + subName + '\'' +
                '}';
    }
}
