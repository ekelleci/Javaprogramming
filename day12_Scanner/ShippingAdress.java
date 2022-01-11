package day12_Scanner;

import java.util.Scanner;

public class ShippingAdress {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in); //

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("Enter building number");
        int buildingNumber = input.nextInt();

        input.nextLine();

        System.out.println("Enter your Street name ");
        String streetName = input.nextLine();

        System.out.println("Enter your SCity ");
        String city = input.nextLine();

        System.out.println("Enter your state ");
        String state = input.next();

        System.out.println("Enter zip code");
        int zipCode = input.nextInt();





        System.out.println(" Your Name=" + fullName);
        System.out.println(" Building Number=" + buildingNumber);
        System.out.println(" Street Name="+ streetName);
        System.out.println(" City Name=" + city);
        System.out.println(" State="+ state);
        System.out.println(" Zip Code =" + zipCode);
    }










}
/*

1. Enter your full name
2. Enter your building number
3. Enter your street name
4. Enter City
5. Enter State
7. Enter Zipcode

Display the shipping adress.
 */