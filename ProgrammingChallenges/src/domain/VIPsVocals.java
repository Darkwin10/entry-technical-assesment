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
public class VIPsVocals {

    private String str;

    public VIPsVocals() {
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int countVocals(String str) {
        this.str = str;
        ////Converts all lowercase letters to uppercase letters
        String str1 = str.toUpperCase();
        //Removes spaces between words
        str1 = str1.replaceAll(" ", "");
        int count = 0;
        int aux = str1.length();
        //Validation of whether the character read is a vowel or not
        for (int i = 0; i < aux; i++) {
            if ((str1.charAt(i) == 'A') || (str1.charAt(i) == 'E') || (str1.charAt(i) == 'I') || (str1.charAt(i) == 'O') || (str1.charAt(i) == 'U')) {
                count++;
            }
        }
        //Return of the result
        return count;
    }
}
