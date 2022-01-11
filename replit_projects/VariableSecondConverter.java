package replit_projects;

import java.util.Scanner;

public class VariableSecondConverter {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
         int inputSecond,hours,minutes,seconds;

        System.out.println(" Enter the second");
        inputSecond=scan.nextInt();

        hours=inputSecond/3600;
        int remainingHours=inputSecond % 3600;
        minutes=inputSecond/60;
        int remainingMinutes=inputSecond%60;


        System.out.println(hours+" hours "+","+minutes+" minutes "+", and"+remainingMinutes+" seconds");



    }
}
