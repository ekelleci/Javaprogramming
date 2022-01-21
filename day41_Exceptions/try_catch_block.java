package day41_Exceptions;

public class try_catch_block {
    public static void main(String[] args) {

        // If there is unchecked exception you can use try catch method
        System.out.println("Test2 started");
        //
        int[] numbers1 = {1,2,3,4,5};
        // there is no index 200----> unchecked exception
        //System.out.println(numbers1[200]);

        System.out.println("Test2 Completed");
        //--------------------------------------------------

        System.out.println("Test2 started");

        int[] numbers = {1,2,3,4,5};

        // repeating the same code with try catch
        try {

            System.out.println(numbers[200]);

            System.out.println("Try Block");

        }catch (RuntimeException e){

            e.printStackTrace();

            System.out.println( e.getMessage() );

        }


        System.out.println("Test2 Completed");

        System.out.println("--------------------------------------------------");

        System.out.println("Test3 started");


        try {
            System.out.println("Cydeo".substring(2, 0));
        }catch (RuntimeException e){
            e.printStackTrace();
        }

        System.out.println("Test3 started");

        System.out.println("--------------------------------------------------");

    }
}
