package taskSolutions;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {

        /*
         write a program to print true if the string "cat" and "dog"
           appear the same number of times in the given sentence

            Ex:
            sentence = "caT dog dogG cAt"

            output:
            true
         */
        // given sentence
        String str="caT dog dog cAt";
        // I need to use frequency
        // step 1  creating 2 temp variable to store frequency of dog and cat
        int numDog=0;
        int numCat=0;

        // Step 2 Since I need frequency of word cat and dog, I need for each loop
        // to be able to use for each loop , I need to convert string ( sentence) to an array

        String [] arr=str.split(" ");

        System.out.println(Arrays.toString(arr));
        // Step 3 using for each loop, finding frequency
        for (String each:arr) {

            if (each.equalsIgnoreCase("cat")){
                numCat++;

            }
            if (each.equalsIgnoreCase("dog")){
                numDog++;
            }

        }
        // step 4  compare numcat and numdog to print true or false
        if (numCat==numDog){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
