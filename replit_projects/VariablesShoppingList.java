package replit_projects;

import java.util.Scanner;

public class VariablesShoppingList {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter the item1: ");
        String item1 = input.nextLine();

        System.out.println("Enter the price1:");
        double price1 = input.nextDouble();

        input.nextLine();

        System.out.println("Enter the item2: ");
        String item2 = input.nextLine();

        System.out.println("Enter the price2:");
        double price2 = input.nextDouble();

        input.nextLine();

        System.out.println("Enter the item3: ");
        String item3 = input.nextLine();

        System.out.println("Enter the price3:");
        double price3 = input.nextDouble();

        input.nextLine();

        System.out.println("Enter the totalPrice:");
        double totalPrice = input.nextDouble( );

        input.nextLine();

        totalPrice = price1+price3+price2;




        System.out.println( " Enter Item 1="+item1);
        System.out.println(" Enter the price1=" + price1);
        System.out.println( " Enter Item 2="+item2);
        System.out.println(" Enter the price2=" + price2);
        System.out.println( " Enter Item 3="+item3);
        System.out.println(" Enter the price3=" + price3);
        System.out.println( "Total price=" + totalPrice);









    }
}
