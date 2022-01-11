package day16_ForLoopStringPractice;

public class WarmUp16 {

    public static void main(String[] args) {

        String str ="aabbbbaacc"; // expected result abc
        //    index= 0123456789
        String result= "";

        for (int i=0;i <=str.length();i++) { // get the characters from the string as index number
            String ch=""+str.charAt(i); // replace the index number by character

            if(!result.contains(ch)) { // if the character is not contain  in the result
                result += ch; // add all characters
            }

        }

        /*
        1. Write a program that can remove the duplicated characters from a String
            Ex:
                input:  AABBCCBC
                Output:    ABC

            Hint: You can add each characters of the string into another String
                  Condition: the character is not contained in the other String yet before you are adding
                  */


    }
}
