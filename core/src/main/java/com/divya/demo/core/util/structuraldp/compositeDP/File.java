package com.divya.demo.core.util.structuraldp.compositeDP;

public class File implements FileSystem{

    String filename;

    File(String filename){
        this.filename = filename;
    }

    @Override
    public void ls() {
        System.out.println("Print file name : "+filename);
    }
}
