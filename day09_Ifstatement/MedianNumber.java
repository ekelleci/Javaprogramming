package day09_Ifstatement;

public class MedianNumber {

    public static void main(String[] args) {

        /*

        2. Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

            Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number

                Possibility # 1 a is the median number
                Possibility # 2 b is the median number
                Possibility # 3 c is the median number
         */

        int a = 10,
                b= 30,
                c = 20;

        boolean aIsMedian = (a>b && a < b) || ( a > c && a <b);
        boolean bIsMedian = (b>c && b>a) || ( b>a && b<c);
        boolean cIsMedian = !aIsMedian && !bIsMedian;

        if ( aIsMedian ) { // if a is the median
            System.out.println( a + " a is the median number");}
        if ( bIsMedian ) { // if b is the median
            System.out.println( b + " b is the median number");   }
        if ( cIsMedian ) { // if c is the median
            System.out.println(c + " c is the median number");          }

        System.out.println("__________________________________________________");

    }
}
