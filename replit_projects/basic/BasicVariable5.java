package replit_projects.basic;
import java.util.Scanner;
public class BasicVariable5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);



        //WRITE YOUR CODE BELOW THIS LINE:
        System.out.println("Enter First Number: ");
        String num1 = scan.nextLine();

        System.out.println("Enter Second Number: ");
        String num2 = scan.nextLine();


        System.out.println("Second number = " + num2);
        System.out.println("First number = " + num1);

        System.out.println("________________________");

        System.out.println("Enter First Number: ");
        int first = scan.nextInt(); // do not change

        System.out.println("Enter Second Number: ");
        int second = scan.nextInt(); // do not change


        System.out.println("Second number = " + first);
        System.out.println("First number = " + second);



    }
}
