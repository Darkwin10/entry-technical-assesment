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
public class DuplicatedCount {

    private String text;

    public DuplicatedCount() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int duplicateCount(String text) {
        this.text = text;
        int count;
        int n = 0;
        int repeat = 0;
        char aux;
        //Converts all uppercase letters to lowercase letters
        String str1 = text.toLowerCase();
        //Removes spaces between words
        str1 = str1.replaceAll(" ", "");
        //Conversion from String to char array
        char[] ch1 = str1.toCharArray();
        int ch1Length = ch1.length;
        ArrayList<String> str = new ArrayList<String>();
        //Function to identify repeated letters and the number of times they are repeated
        for(int i = 0; i < ch1Length; i++){
            aux = ch1[i];
            count = 0;
            for(int j = 0; j < ch1Length; j++){
                if((count > 1) && (j == (ch1Length - 1)) && (aux != '9')){
                    str.add(n, Character.toString(aux)+ ":" + count);
                    repeat++;
                    n++;
                }else if(aux == ch1[j] && (j != (ch1Length - 1)) ){
                    count++;
                    ch1[j] = '9';  
                }else if((count > 0) && (j == (ch1Length - 1)) && (aux != '9') && (aux == ch1[j])){
                    count++;
                    str.add(n, Character.toString(aux)+ ":" + count);
                    repeat++;
                    n++;
                }
            }
        }
        //Screen printout of the result
        System.out.println("letters repeat; " + repeat + " ");
        System.out.print("they are :");
        Iterator<String> pair = str.iterator();
        while (pair.hasNext()) {
            String elemento = pair.next();
            System.out.print(elemento + ",");
        }
        return 0;
    }
}
