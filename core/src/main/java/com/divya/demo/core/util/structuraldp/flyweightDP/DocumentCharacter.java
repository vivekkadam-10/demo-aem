package com.divya.demo.core.util.structuraldp.flyweightDP;

//Intrinsic - character, fontType, size
//Extrinsic - x,y
//Context class
public class DocumentCharacter implements ILetter{

    private char character;
    private String fontType;
    private int size;

    DocumentCharacter(char character,String fontType,int size){
        this.character = character;
        this.fontType = fontType;
        this.size = size;
    }


    @Override
    public void display(int x,int y) {
        System.out.println("Object created at "+x+" , "+y);
    }
}
