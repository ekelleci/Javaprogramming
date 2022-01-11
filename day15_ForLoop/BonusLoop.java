package day15_ForLoop;

import java.util.Scanner;

public class BonusLoop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*
        1. Write a program that can return the sum of even numbers between 1 to 100
         */
        double sum = 0;
        for (int i = 0; i <= 100; i+=2) {
            sum +=i;
        }
        System.out.println(sum);
        System.out.println("-------------");

        /*
       2- Write a program that can return the sum of odd numbers between 1 to 100
         */

        double sum2 = 0;
        for (int i = 1; i <= 100; i+=2) {
            sum2 +=i;
        }
        System.out.println(sum2);
        System.out.println("-------------");

        /*

        write a program that can calculate the sum of all numbers between 1 to any given number
            ex:

                input: 50
                output: 1275
         */

        double sum3 = 0;
        int numx=25;
        for (int i = 1; i <= numx; i++) {
            sum3 +=i;
        }
        System.out.println(sum3);
        System.out.println("-------------");

        /*
        4. Write a program that can return the factorial number of any given number
            Ex:
                input: 5
                output: 120
                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
         */
        System.out.println("Enter a number:");
        int number = new Scanner(System.in).nextInt();

        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial*=i;
        }
        System.out.println(factorial);
        System.out.println("-------------");

        /*
        write a program that can retive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!

         */

        int length;
        String letters = "";
        String digits = "";
        String specialChar = "";
        char ch;

        System.out.println("Enter a string: ");
        String str = scan.nextLine();

        length = str.length();

        for (int i = 0; i <= length - 1; i++) {
            ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                letters += ch;
            } else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                digits += ch;
            } else {
                specialChar +=ch;
            }
        }
        System.out.println("Letters: "+letters);
        System.out.println("Digits: "+digits);
        System.out.println("Specia chars: "+specialChar);
        scan.close();
        System.out.println("-------------");


        /*
        Write a program that can reverse any given string
			Ex:
				input: 					Wooden Spoon
				output:					noopS nedooW
         */

        System.out.println("Enter your string");
        String stra = scan.nextLine();
        String reverse = "";

        for (int i = (stra.length()-1); i >= 0; i--) {
            reverse += stra.charAt(i);

        }
        System.out.println("reverse = " + reverse);




    }
}
