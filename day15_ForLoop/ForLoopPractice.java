package day15_ForLoop;

public class ForLoopPractice {

    public static void main(String[] args) {
/*
print the numbers between 15 and 45.
 */
        for (int i=15;i <=45;i++){
            System.out.print(i+" ");

        }
        System.out.println();
        System.out.println("______________________");

        for( int i = 100; i >=50;i--){

            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("_________________");
// print all the even number between 1 ~55
// option 1
        for (int i=2;i <=55;i+=2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("_________________");
 // option 2 using if statement

        for (int i=1;i <=55;i++) {

            if ( i%2==0){ // if I has a
                System.out.print(i+" ");
            }


        }



    }
}
