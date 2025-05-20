package com.divya.demo.core.util.structuraldp.flyweightDP;

import java.util.HashMap;
import java.util.Map;

public class LetterFactory {

    static Map<Character,ILetter> characterCache = new HashMap<>();

    static ILetter createLetter(char characterVal){
        if(characterCache.containsKey(characterVal)){
            return characterCache.get(characterVal);
        } else{
            DocumentCharacter character = new DocumentCharacter(characterVal,"Arial",10);
            characterCache.put(characterVal,character);
            return character;
        }
    }
}
