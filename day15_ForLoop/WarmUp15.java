package day15_ForLoop;

import java.util.Scanner;

public class WarmUp15 {

    public static void main(String[] args) {

        /*
         1. Write a program that asks user to enter a word. If the work starts with x, replace it with a.
            Input:
    xcodex
    Output:
    acodex

         */

        System.out.println( " Enter a word:");
        String word = new Scanner(System.in).next(); // xcodex

        if (word.charAt(0) == 'x') {
            word = word.replaceFirst("x","a");//
        }

        System.out.println(word);

        System.out.println("___________________________________________________________________");
        /*
        2. Write a program that asks user to enter a word. and replace all the x or X with character a
    Input:
    xcodeX
    Output:
    acodea

         */

        String str1= " xcodeX";
        String result=str1.replace(" x","a").replace("X","a");

        System.out.println(result);


        System.out.println("___________________________________________________________________");

        /*
        3. Write a program that asks user to enter first and last names, and then prints the full name in regular format
        (first character in upper case) use sub string method

    input:
    firstName = "cyDEo"
    lastName = "SCHOOL";

    output:
    Cydeo School
         */

        String firstName = "cyDEo";
        String lastName = "SCHOOL";

        firstName = firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
        //                     C               + ydeo  ==  Cydeo

        System.out.println( firstName);


    }


}
