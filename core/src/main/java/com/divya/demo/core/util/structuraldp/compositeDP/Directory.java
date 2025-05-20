package com.divya.demo.core.util.structuraldp.compositeDP;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{

    String directoryName;
    List<FileSystem> fileSystemList = new ArrayList<>();

    /*Directory(String directoryName, List<FileSystem> fileSystemList){
        this.directoryName = directoryName;
        this.fileSystemList = fileSystemList;
    }*/

    void add(FileSystem fileSystemObj){
        fileSystemList.add(fileSystemObj);
    }

    @Override
    public void ls() {
        System.out.println("Directory name : "+directoryName);
        for(FileSystem fileSystem:fileSystemList){
            fileSystem.ls();
        }
    }
}
