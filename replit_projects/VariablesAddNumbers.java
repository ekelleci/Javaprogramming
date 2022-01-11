package replit_projects;

import java.util.Scanner;

public class VariablesAddNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1,num2,num3;


        System.out.println("Enter 3 numbers");
        num1= scan.nextInt();
        num2= scan.nextInt();
        num3= scan.nextInt();

        int sum = num1+num2+num3;

        System.out.println("Sum of Numbers:" + sum);


    }
}
