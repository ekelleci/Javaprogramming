package day11_switch_scanner;


import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {


        Scanner imput = new Scanner(System.in);

        System.out.println( " Enter an integer:");

        int num1 = imput.nextInt();

        System.out.println( " enter a decimal");

        double num2 = imput.nextDouble( );

        System.out.println( num1);
        System.out.println( num2 );
        System.out.println( " Multiplication:" + ( num1 * num2));

        imput.close(); // closes the scanner


    }



}
