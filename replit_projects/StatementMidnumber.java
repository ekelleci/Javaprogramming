package replit_projects;

import java.util.Scanner;

public class StatementMidnumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1= scan.nextInt();

        System.out.println("Enter second number:");
        int num2= scan.nextInt();

        System.out.println("Enter third number:");
        int num3= scan.nextInt();

        boolean num1Medien = (num1>num3&&num1<num2)|| (num1>num2&&num1<num3);
        boolean num2Medien = (num2>num1&&num2<num3) || (num2>num3&&num2<num1);
        boolean num3Medien= !num1Medien && !num2Medien;

        if ( num1Medien ) {
            System.out.println( " Medium value is:"+num1);}
        if (num2Medien) {
            System.out.println( " Medium value is:"+num2); }
        if ( num3Medien ) {
            System.out.println(" Medium value is:"+num3);  }


    }
}
