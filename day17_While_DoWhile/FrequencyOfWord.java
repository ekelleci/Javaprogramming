package day17_While_DoWhile;

public class FrequencyOfWord {
    public static void main(String[] args) {

         /*
         write a program that can return the frequency of the a word Java from the sentence

          */

        String str= " javajavajava"; // first step to find how many character input has -4- then use subString

        int frequency= 0; // frequency of the word
        // to aviod creating all possible substrings create a loop
        for (int i = 0; i < str.length()-3; i++) { // -3 for max i to create substrings
            String eachSub = str.substring(i,i+4);

            if (eachSub.equals("java")){

                frequency++;
            }

        }

        System.out.println(frequency);


    }
}
