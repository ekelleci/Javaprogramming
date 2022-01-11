package taskSolutions;

import java.util.Scanner;

public class day19_grade_calculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        /*
        4. Write a program for grade calculator:
			1. Ask the user "Enter your score"
				If user enters invalid score, terminate the program after displaying the error message "Invalid Entry"

			 2. Display the grade of the student.
			 		90 ~ 100 ==> A
			 		80 ~ 89 ==> B
			 		70 ~ 79 ==> C
			 		60 ~ 69 ==> D
			 		0 ~ 59 ==> F

			2. Ask the user would you like to continue
				If "yes" --> repeat the previous steps
				If "no" --> print "Thank you for using Cydeo Grade Calculator APP"

				If user enters an invalid entry, terminate the program after displaying the error message "Invalid Entry"

         */

        while (true) {

            System.out.println("Enter your score");
            int score = scan.nextInt();

            if (score > 100 && score < 0) {
                System.out.println("Invalid entry");
                System.exit(0);
            }

            if (score > 89) {
                System.out.println("Score: A");
            } else if (score > 79) {
                System.out.println("Score: B");
            } else if (score > 69) {
                System.out.println("Score: C");
            } else if (score > 59) {
                System.out.println("Score: D");
            } else {
                System.out.println("Score: F");
            }

            System.out.println("Would you like to continue?");
            String answer= scan.next();

            while (!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))) {
                System.out.println("Invalid entry,Please re-enter");
                answer = scan.next();
            }

            if(answer.equalsIgnoreCase("no")){
                System.out.println("Thank you for using Cydeo Grade Calculator APP");
                System.exit(0);
            }


        }


    }
}
