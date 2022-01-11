package taskSolutions;

import java.util.Scanner;

public class day18_Calculator {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        while (true){
            System.out.println("Enter the first number");
            int num1= scan.nextInt();

            System.out.println("Enter a math operator");
             char ch = scan.next().charAt(0);

            while (!(ch== '+'||ch=='-'||ch=='*'||ch=='/')){
                System.err.println("invalid entry, re-enter valid entry");
                ch=scan.next().charAt(0);
            }

         System.out.println("Enter the second number");
         int num2= scan.nextInt();


         if(ch== '+'){
            System.out.println(num1+num2);
         }
         if(ch== '-') {
            System.out.println(num1 - num2);
         }
         if(ch== '*') {
            System.out.println(num1 * num2);
         }
         if(ch== '/') {
            System.out.println(num1 / num2);

         }

            System.out.println();

         System.out.println("Dou you want to continue?");

            String answer = scan.nextLine();
            if (answer.equals("yes")) {
                continue;
            } else {
                System.out.println("See you");
                break;


        }
        }






        /*
        3. Write a program that can calculate two numbers.
			1. Ask user to enter the first number
			2. Ask user to enter a math operator (+,-,/,*)
				(if user enters any invalid operator, repeat this step until user provides a valid operator)
			3. Ask user to enter the second number
			4. Display the result
			5. Ask user if they want to continue? (yes/no)
				if yes ==> repeat the entire steps
				if no ==> print "Thanks for using Cydeo calculator!"
				If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry

         */
    }
}
