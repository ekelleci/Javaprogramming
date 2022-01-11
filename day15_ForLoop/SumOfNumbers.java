package day15_ForLoop;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

        double sum = 0;

        for (int i = 0; i <101 ; i++) {// 1234...100
        sum +=i;// get the numbers and add them to the sum

        }

        System.out.println(sum);

        System.out.println("-------------");

        int total = 0;
        Scanner scan =new Scanner(System.in);

        for (int i = 0; i <5 ; i++) {
            System.out.println(" Enter a number");
            total+=scan.nextInt();



        }
        System.out.println( "Total=" + total);


        /* System.out.println(" Enter a number");
        total+=scan.nextInt();
        System.out.println(" Enter a number");
        total+=scan.nextInt();
        System.out.println(" Enter a number");    // to ask a user enter a number 5 times
        total+=scan.nextInt();
        System.out.println(" Enter a number");
        total+=scan.nextInt();
        System.out.println(" Enter a number");
        total+=scan.nextInt();*/


    }
}
