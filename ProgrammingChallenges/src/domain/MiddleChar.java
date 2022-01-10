/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Fernando Darwin VazC
 */
public class MiddleChar {
    private String word;

    public MiddleChar() {
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
    
    public String getMiddle(String word)
    {
        this.word = word;
        String middle;
        //Conversion from String to char array
        char[] ch1 = word.toCharArray();
        int ch1Length = ch1.length;
        //Function to get the middle character(s)
        if((ch1Length%2) != 0){
            middle = Character.toString(ch1[(ch1Length/2)]);
        }else{
            middle = Character.toString(ch1[(ch1Length/2)-1]);
            middle = middle + Character.toString(ch1[(ch1Length/2)]);
        }
        return middle;
    }
}
