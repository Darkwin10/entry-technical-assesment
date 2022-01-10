/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.*;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Fernando Darwin VazC
 */
public class TestChalleges {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean exit = false;
        int option;
      
        while (!exit) {
            System.out.println("Challenges menu");
            System.out.println("Choose the Challenge you wish to view:");
            System.out.println("1. Across Years");
            System.out.println("2. Scramble");
            System.out.println("3. Middle Char");
            System.out.println("4. Duplicated Count");
            System.out.println("5. VIPs Vocals");
            System.out.println("6. Recursive Multiplier");
            System.out.println("7. Recursive Sum");
            System.out.println("8. Array Couple");
            System.out.println("9. Give me this IP");
            System.out.println("10. Exit");

            try {

                System.out.println("Write your answer here:");
                option = sn.nextInt();

                switch (option) {
                    case 1:
                        System.out.println("Across Years");
                        System.out.println("Enter a year here :");
                        //Test values: 1, 99, 101, 2020
                        int year = sn.nextInt();
                        AcrossYears year1 = new AcrossYears();
                        //Output depending on input: 1,1,2,21
                        System.out.println("Century is = " + year1.yearsToCenturies(year));
                        //Allows the response to be displayed until the user wants to continue.
                        sn.nextLine();
                        System.out.println("Press enter to continue.....................");
                        sn.nextLine();
                        break;
                    case 2:
                        System.out.println("Scramble");
                        System.out.println("Enter a text:");
                        //Clean the input of any junk values
                        sn.nextLine();
                        //Test values: hdsasdellsdasooawwadwdwawrl, dsasdeldasooawwadwdwaw, hd ell oo w rl
                        String str1 = sn.nextLine();
                        System.out.println("Press enter to continue");
                        //Clean the input of any junk values
                        sn.nextLine();
                        System.out.println("Enter a word to search in the text:");
                        //Test values: helloworld
                        String str2 = sn.next();
                        Scramble scramble1 = new Scramble();
                        //Output depending on input: True, Falsae, True
                        System.out.println("Scramble is = " + scramble1.scrambling(str1, str2));
                        //Allows the response to be displayed until the user wants to continue.
                        sn.nextLine();
                        System.out.println("Press enter to continue.....................");
                        sn.nextLine();
                        break;
                    case 3:
                        System.out.println("Middle Char");
                        System.out.println("Enter a word:");
                        //Test values: pair, odd, finish
                        str1 = sn.next();
                        MiddleChar middleChar = new MiddleChar();
                        //Output depending on input: ai, d, ni
                        System.out.println("Middle char is = " + middleChar.getMiddle(str1));
                        //Allows the response to be displayed until the user wants to continue.
                        sn.nextLine();
                        System.out.println("Press enter to continue.....................");
                        sn.nextLine();
                        break;
                    case 4:
                        System.out.println("Duplicated Count");
                        System.out.println("Enter a text:");
                        //Clean the input of any junk values
                        sn.nextLine();
                        //Test values: hey, hello, AcCoMmOdatIOn
                        str1 = sn.nextLine();
                        DuplicatedCount dc = new DuplicatedCount();
                        //Output depending on input: 0, 1 letter l :1, 4 letters a:2,c:2,o:3,m:2
                        dc.duplicateCount(str1);
                        //Allows the response to be displayed until the user wants to continue.
                        System.out.println("");
                        System.out.println("Press enter to continue.....................");
                        sn.nextLine();
                        break;
                    case 5:
                        System.out.println("VIPs Vocals");
                        System.out.println("Enter a text:");
                        //Clean the input of any junk values
                        sn.nextLine();
                        //Test values: n0n3, aeiou AEIOU, vowel counting is not an everyday thing
                        str1 = sn.nextLine();
                        VIPsVocals vocal1 = new VIPsVocals();
                        //Output depending on input: 0, 10 ,12
                        System.out.println("Vocal number = " + vocal1.countVocals(str1));
                        //Allows the response to be displayed until the user wants to continue.
                        System.out.println("Press enter to continue.....................");
                        sn.nextLine();
                        break;
                    case 6:
                        System.out.println("Recursive Multiplier");
                        System.out.println("Enter a number here:");
                        //Test values: 20, 236
                        int num = sn.nextInt();
                        RecursiveMultiplier recursive1 = new RecursiveMultiplier();
                        //Output depending on input: 0, 8
                        recursive1.recursiveMultiply(num);
                        //Allows the response to be displayed until the user wants to continue.
                        sn.nextLine();
                        System.out.println("Press enter to continue.....................");
                        sn.nextLine();
                        break;
                    case 7:
                        System.out.println("Recursive Sum");
                        System.out.println("Enter a number here:");
                        //Test values: 20, 236
                        num = sn.nextInt();
                        RecursiveSum recursivesum1 = new RecursiveSum();
                        //Output depending on input: 2, 2
                        recursivesum1.recursiveSuma(num);
                        //Allows the response to be displayed until the user wants to continue.
                        sn.nextLine();
                        System.out.println("Press enter to continue.....................");
                        sn.nextLine();
                        break;
                    case 8:
                        System.out.println("Array Couple");
                        System.out.println("Enter a text:");
                        //Clean the input of any junk values
                        sn.nextLine();
                        //Test values: hey, hello world, Give me some pairs please
                        str1 = sn.nextLine();
                        ArrayCouple arr = new ArrayCouple();
                        //Output depending on input: he,y, he,ll,o ,wo,rl,d, Gi,ve, m,e ,so,me, p,ai,rs, p,le,as,e,
                        String[] text1 = arr.coupleArray(str1);
                        for (int i = 0; i < text1.length; i++) {
                            String elemento = text1[i];
                            System.out.print(elemento + ",");
                        }
                        //Allows the response to be displayed until the user wants to continue.
                        System.out.println("");
                        System.out.println("Press enter to continue.....................");
                        sn.nextLine();
                        break;
                    case 9:
                        System.out.println("Give me this IP");
                        System.out.println("Enter a number here(the letter L is not necessary):");
                        //Test values: 2147483467, 2148473367
                        long num1 = sn.nextLong();
                        GivemethisIP ip1 = new GivemethisIP();
                        //Output depending on input: 127.255.255.75, 128.15.26.23
                        ip1.longToIP(num1);
                        //Allows the response to be displayed until the user wants to continue.
                        sn.nextLine();
                        System.out.println("");
                        System.out.println("Press enter to continue.....................");
                        sn.nextLine();
                        break;
                    case 10:
                        exit = true;
                        break;
                    default:
                        System.out.println("Only number between 1 and 10");
                        //Allows the response to be displayed until the user wants to continue.
                        sn.nextLine();
                        System.out.println("Press enter to continue.....................");
                        sn.nextLine();

                }
            } catch (InputMismatchException e) {
                System.out.println("The answer is of an invalid type, please try again.");
                //Allows the response to be displayed until the user wants to continue.
                sn.nextLine();
                System.out.println("Press enter to continue.....................");
                sn.nextLine();
            }
        }
    }

}
