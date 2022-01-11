package replit_projects;

import java.util.Scanner;

public class StatementBiggerNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter 2 numbers");
        int num1= scan.nextInt();
        int num2= scan.nextInt();

        if ( num1>num2){
            System.out.println(num1 + " is greater");
        }else{
            System.out.println(num2 + " is greater");
        }
    }
}
