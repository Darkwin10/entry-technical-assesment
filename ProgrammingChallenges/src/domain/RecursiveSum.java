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
public class RecursiveSum {
    private int n;

    public RecursiveSum() {
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public int recursiveSuma(int n)
    {
        this.n = n;
        //Integer to String conversion
        String str1 = String.valueOf(n);
        //Recursive function call
        int res = recursive(str1);
        //Output 
        System.out.println("value = " + res);
        return 0;
    }
    
    public int recursive(String str1 ){
        //Validation to stop recursive function
        if(str1.length() == 1){
            int res = Integer.parseInt(str1);
            return res;
        }else {
            //Conversion from String to char array
            char[] ch1 = str1.toCharArray();
            int a = ch1.length;
            int[] temp = new int[a];
            int count = 0;
            //Obtaining and saving each digit
            for(int i = 0; i < ch1.length; i++){
                temp[i] = Character.getNumericValue(ch1[i]); 
            }
            //Sum of all digits
            for(int i = 0; i < temp.length; i++){
                if(i == 0){
                    count = temp[i];
                }else{
                    count += temp[i];
                }
            }
            //Integer to String Conversion
            String str2 = String.valueOf(count);
            //Call to recursive function
            return recursive(str2);
        }
    }
}
