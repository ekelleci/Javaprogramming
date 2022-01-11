package day22_MultidimensionalArray;

import java.util.Arrays;

public class warmUp2 {
    public static void main(String[] args) {
        /*
        Write a program that can reverse the second word of the sentence
            Ex:
                sentence = "I Love Java";

            output:
                I evoL Java
         */

        String sntc="I love java";
        String rvrs=" "; // S1 giving temp variable
       // S2 break it down to words and make Array
        String[] words=sntc.split(" ");
        // create a loop to get 2nd element and reverse it
        for (int i = words[1].length()-1; i >=0; i--) {
            rvrs+=words[1].charAt(i);


        }

        System.out.println(rvrs);

        // adding reversed element to back to Array
        words[1]=rvrs;

        System.out.println(Arrays.toString(words));

    }
}
