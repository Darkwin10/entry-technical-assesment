/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.*;

/**
 *
 * @author Fernando Darwin VazC
 */
public class ArrayCouple {
    private String str;

    public ArrayCouple() {
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
    
    public String[] coupleArray(String str)
    {
        this.str = str;
        //Conversion from String to char array
        char[] ch1 = str.toCharArray();
        int aux = ch1.length;
        //function to obtain an array of paired chars
        if(aux%2 != 0){
            String[] text = new String[aux/2+1];
            for(int i = 0; i < aux/2 + 1; i++){
            if(i == aux/2){
                text[aux/2] = (Character.toString(ch1[aux-1]));
            }else{
                text[i] = (Character.toString(ch1[i*2]) + Character.toString(ch1[(i*2)+1]));
            }
        }
            //Returns the String array
            return text;
        }else{
            String[] text = new String[aux/2];
            for(int i = 0; i < aux/2; i++){
            text[i] = (Character.toString(ch1[i*2]) + Character.toString(ch1[(i*2)+1]));
        }
            //Returns the String array
            return text;
        }
    }   
}
