package day13_String;

import java.util.Scanner;

public class myInfo {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println( " Enter your age");
        int age = input.nextInt();

        System.out.println( " Enter your gender");
        String gender = input.next();
        input.nextLine();

        System.out.println( " Enter your full name");
        String fullName= input.nextLine();

        System.out.println( " Enter your number");
        long phoneNumber= input.nextLong();

        System.out.println( " Enter your zip code");
        int zipCode= input.nextInt();
        input.nextLine();

        System.out.println( " Enter your School name");
        String school= input.nextLine();

        System.out.println( " Enter your city name");
        String city= input.nextLine();

        System.out.println( " Enter your state");
        String state= input.next();

        System.out.println( " Enter your building number");
        int buildingNumber= input.nextInt();
        input.nextLine();

        System.out.println( " Enter your street name");
        String streetName= input.nextLine();


        input.close();

        System.out.println( "Full name = "+ fullName);
        System.out.println( "Your age = " + age);
        System.out.println( "Your gender = " + gender);
        System.out.println( "Phone Number = " + phoneNumber);
        System.out.println( "Address = \n\t"+buildingNumber+" "+streetName + "\n\t" + city +" , "+state +" "+ zipCode);
        System.out.println( "School name = " + school);





       ;












    }
}
