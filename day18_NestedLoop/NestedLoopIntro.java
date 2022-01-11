package day18_NestedLoop;

public class NestedLoopIntro {

    public static void main(String[] args) {
/*
repeat the wooden spoon 4x3 times
 */
        for (int i = 0; i < 3; i++) { // prints wooden spoon 5 times
            System.out.println("Wooden Spoon");

        }
        for (int i = 0; i < 3; i++) { // prints wooden spoon 5 times
            System.out.println("Wooden Spoon");

        }
        for (int i = 0; i < 3; i++) { // prints wooden spoon 5 times
            System.out.println("Wooden Spoon");

        }
        for (int i = 0; i < 3; i++) { // prints wooden spoon 5 times
            System.out.println("Wooden Spoon");

        }
        System.out.println("________ 12 times");

// nested loop is the loop within the a loop
        for (int j = 0; j < 4; j++) {

            for (int i = 0; i < 3; i++) {

                System.out.println(" wooden spoon" );

            }

        }


    }
}
