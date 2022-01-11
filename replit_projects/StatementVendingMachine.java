package replit_projects;

import java.util.Scanner;

public class StatementVendingMachine {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println(" Enter the cent amount");
        int cents=scan.nextInt();
        scan.close();

        if (cents>0 && cents<100){
            int quarter = cents / 25;
            cents = cents %25;

            int dime = cents /10;
            cents = cents % 10;

            int nickel = cents/5;
            cents = cents % 5;

            int penny = cents;

            String result= "Your change is "+ quarter + " quarters, "+  dime + " dimes, " + nickel + " nickels, " +"and " + penny+ " pennies";

            System.out.println(result);
        }else{
            System.out.println("Invalid cents amount");
        }
    }
}
