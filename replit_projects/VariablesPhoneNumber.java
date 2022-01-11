package replit_projects;

import java.util.Scanner;

public class VariablesPhoneNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println();
        System.out.println(" Please enter the area code");
        int areaCode=scan.nextInt();
        System.out.println("Please enter the local number");
        int localNumber=scan.nextInt();

        String phoneNumber = "(" + areaCode +")"+"-"+localNumber;
        System.out.println(phoneNumber);






    }
}
