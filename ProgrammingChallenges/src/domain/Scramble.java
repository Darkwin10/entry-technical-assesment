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
public class Scramble {

    private String str1;
    private String str2;

    public Scramble() {
    }

    public String getStr1() {
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    public String getStr2() {
        return str2;
    }

    public void setStr2(String str2) {
        this.str2 = str2;
    }

    public boolean scrambling(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
        int flag = 0;
        //Conversion from String to char array
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        int ch1Length = ch1.length;
        int ch2Length = ch2.length;
        //Function to search for the letters of the word in the text
        for (int i = 0; i < ch1Length; i++) {
            for (int j = 0; j < ch2Length; j++) {
                if (ch1[i] == ch2[j]) {
                    ch1[i] = '9';
                    ch2[j] = '9';
                }
            }
        }
        //Loading of the flag indicating if the letters were found in the text.
        for (int i = 0; i < ch2Length; i++) {
            if (ch2[i] == '9') {
                flag++;
            }
        }
        //Return validation of whether all the letters of the word were found in the text.
        return flag == ch2Length;
    }
}
