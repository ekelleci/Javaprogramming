package day41_Exceptions;

import taskSolutions.day39.Student;

public class Checked_vs_Unchecked {
    public static void main(String[] args) {
        // Unchecked exceptions

        int a =10;
        int b =0;

        System.out.println(a/b);
        /*
        This is unchecked exception because it is checked during runtime. Java will check it during runtime. It will
        let you run the program and give you the error code in the consul.
        --------------------
        Exception in thread "main" java.lang.ArithmeticException: / by zero
	     at day41_Exceptions.Checked_vs_Unchecked.main(Checked_vs_Unchecked.java:10)

          Process finished with exit code 1

         */

        char[] characters={'A','B','C'};
        //                  0   1   2
        /* Trying to print the character at index #4. There is no index 4 in the character arr
         It does not give compile error
         However, it will show the error after you run it*/
        System.out.println(characters[4]);
        /*
        Exception in thread "main" java.lang.ArithmeticException: / by zero
	      at day41_Exceptions.Checked_vs_Unchecked.main(Checked_vs_Unchecked.java:10)

        Process finished with exit code
         */

        Student student=null;
        System.out.println(student);
        /*
        Exception in thread "main" java.lang.ArithmeticException: / by zero
	at day41_Exceptions.Checked_vs_Unchecked.main(Checked_vs_Unchecked.java:12)

         */

        // CHECKED EXCEPTION.

        System.out.println(" Hello");
        // to pause it 5 sec
        // Thread.sleep(3000); it gives compile error.It does not let you run

        System.out.println("Cydeo");


    }

}
