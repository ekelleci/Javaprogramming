package day20_Array;

public class MinimumNumberOfArray {
    public static void main(String[] args) {

        int[] numbers={ 100,500,30,40,600,90}; // find th minimumnumber

        int min=numbers[0];// to get the first element -100-
        // to compare the one array with rest of them, we will use loop

        for (int i = 0; i < numbers.length; i++) { // we will check each one
            // create a condition to compare nymbers of index in an array

            if (numbers[i]<min){
                min=numbers[i];// when there is a smaller number, this assigns to min
            }

        }

        System.out.println(min);







    }
}
