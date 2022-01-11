package day08_ifStatement;

public class SingleIfStatementIntro {

    public static void main(String[] args) {

        int number = 300;

       /* System.out.println( " odd number");
        System.out.println( " even number"); */

        boolean evenNumber = number % 2 == 0;
        boolean oddNumber = ! evenNumber;


        if ( evenNumber){
            System.out.println( number+ " is even number");
        if ( oddNumber) {
            System.out.println(number + " is a oddnumber");

    System.out.println("______________________________________________________");

            int n = 200;

            if ( n > 0 ) {
                System.out.println(n + " is positive");


            if ( n < 0 ) {
                System.out.println(n + " is negative");


            }

            }





        }
        }


    }
}
