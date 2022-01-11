package replit_projects;


import java.util.Scanner;

public class VariablesTime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(" Enter Hour");
        int hour=scan.nextInt();

        System.out.println("Enter Minute");
        int minute=scan.nextInt();

        System.out.println("Enter Second");
        int second= scan.nextInt();

        System.out.println(" AM or PM");
        String  amOrPm =scan.next();


        System.out.println("'"+hour+":"+minute+":"+second+":"+amOrPm+"'");






    }
}
