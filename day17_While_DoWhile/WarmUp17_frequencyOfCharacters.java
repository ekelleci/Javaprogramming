package day17_While_DoWhile;

public class WarmUp17_frequencyOfCharacters {
    public static void main(String[] args) {
        String str = "AABBACDD";
        char ch = 'A'; // This is the character
        int frequecy = 0;

        for (int i = 0; i < str.length(); i++) { //i=indexes of str
            char eachChar = str.charAt(i); // gives each character of the tsr

            //We will compare ch with eachChar and increase the frequency by 1

            if (ch == eachChar) { // if given ch equals to eachchar

                frequecy++; // increase the frequency by 1



            }
        }
        System.out.println(frequecy);


      /*
        Write a program that asks user to entera string and a char, the returns
        the frequency of the char from the given string

        Ex:
        inputs:
        str = "aabcccd";
        char = 'c';


       */



        }
    }
