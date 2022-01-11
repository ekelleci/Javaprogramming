package day20_Array;

import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] numbers=new int[10]; // this is the array that we will store numbers

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number");// this loop runs 10 times to get user imputs.
            numbers[i]=scan.nextInt(); // each input will be assinged to the (i)indexes of array

        }

        int max=numbers[0];
        int min=numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i]>max) {
                max=numbers[i];
            }
           if(numbers[i]<min){

           }
        }

        System.out.println("min"+min);
        System.out.println("max"+max);



    }
}
