package taskSolutions;

import java.util.Scanner;

public class day19_CircleTask {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        while (true) {

            System.out.println("Enter the radius of the circle");
            double radiusOfCircle = scan.nextDouble();

            if (radiusOfCircle <= 0) {
                System.err.println("invalid entry for the radiusOfCircle");
                System.exit(0);

            }
            double diameterOfCircle = 2 * radiusOfCircle;
            double areaOfCircle = 3.14 * radiusOfCircle;
            double perimeterOfCircle = diameterOfCircle * 3.14;

            System.out.println("diameterOfCircle = " + diameterOfCircle);
            System.out.println("areaOfCircle = " + areaOfCircle);
            System.out.println("perimeterOfCircle = " + perimeterOfCircle);

            System.out.println("would you like to calculate another circle? (yes/no)");
            String a = scan.next();




            while (!(a.equalsIgnoreCase("yes")|| a.equalsIgnoreCase("no"))) {
                System.err.println("invalid entry");
                System.out.println("would you like to calculate another circle?");
                a = scan.next();
            }
            if(a.equalsIgnoreCase("no")){
                System.out.println("thank you for using Cydeo circle calculator APP");
                break;
            }

        }




        /*
        1. Write a program that can calculate the area and perimeter of a circle:
			1. Ask the user "Enter the radius of the circle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the radius of the circle"

			2. Display:
					1. Diameter of circle
					2. Area of circle
					3. Perimeter of circle

			3. Ask the user "Would you like to calculate another circle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

			Hint: Ones Uzun knows all the formulas you need for this task


	2. Write a program that can calculate the area and perimeter of a Square:
			1. Ask the user "Enter the side of the square:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the side of the square"

			2. Display:
					1. Area of square
					2. Perimeter of square

			3. Ask the user "Would you like to calculate another Square?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Square Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

			Hint: Ones Uzun knows all the formulas you need for this task


	3. Write a program that can calculate the area and perimeter of a Rectangle:
			1. Ask the user "Enter the length of the Rectangle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the length of the rectangle"

			2. Ask the user "Enter the width of the Rectangle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the width of the rectangle"

			3. Display:
					1. Area of rectangle
					2. Perimeter of rectangle

			4. Ask the user "Would you like to calculate another Rectangle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Rectangle Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

			Hint: Ones Uzun knows all the formulas you need for this task

         */
    }
}
