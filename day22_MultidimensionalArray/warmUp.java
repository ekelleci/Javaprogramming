package day22_MultidimensionalArray;

import java.util.Arrays;

public class warmUp {
    public static void main(String[] args) {
        /*
        1. Write a program that can reverse a sentence
            Ex:  sentence = "Today is a good day to learn Java";

            output:   Java learn to day good a is Today
         */


        String sentence="Today is a good day to learn Java";
        // Step 1 is to split the sentence into word in Array
        // {Today, is, a, good, day, to, learn, Java
        String [] words=sentence.split("");

        // Step 2 create a teporary variable to store the data
        String revSentence=" ";

        // Step3 is to create for loop to get each word
        // and print the words from end to beginning

        for (int i = words.length-1; i >= 0 ; i--) {
        // then assign the revesred words to tem variable

        revSentence+=words[i] + " ";

        }

        // last step to print

        System.out.println(revSentence);


    }
}
