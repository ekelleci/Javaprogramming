package replit_projects;

import java.util.Scanner;

public class StatementsGiftCard {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String item = scan.nextLine();

        int card = 100;


        if( item.equals("Blanket")||item.equals("Charger")||item.equals("Hat")||item.equals("Headphones")||item.equals("Laptop")||item.equals("Pants")||item.equals("Pillow")||item.equals("Smartphone")||item.equals("Socks")||item.equals("USB cable")){
            if( item.equals("Blanket")){
                System.out.println("Thank you for your purchase!\nYour current balance is: "+(card-60)+"$");
            }else if( item.equals("Charger")){
                System.out.println("Thank you for your purchase!\nYour current balance is: "+(card-15)+"$");
            }else if(item.equals("Hat")){
                System.out.println("Thank you for your purchase! \nYour current balance is: "+(card-25)+"$");
            }else if( item.equals("Headphones")){
                System.out.println("Thank you for your purchase! \nYour current balance is: "+(card-30)+"$");
            }else if( item.equals("Laptop")){
                System.out.println("Sorry, not enough funds on your gift card!");
            }else if( item.equals("Pants")){
                System.out.println("Thank you for your purchase! \nYour current balance is: "+(card-50)+"$");
            }else if( item.equals("Pillow")){
                System.out.println("Thank you for your purchase! \nYour current balance is: "+(card-40)+"$");
            }else if( item.equals("Smartphone")){
                System.out.println("Sorry, not enough funds on your gift card!");
            }else if( item.equals("Socks")){
                System.out.println("Thank you for your purchase!\nYour current balance is: "+(card-5)+"$");
            }else{
                System.out.println("Thank you for your purchase!\nYour current balance is: "+(card-10)+"$");
            }


        } else{
            System.out.println("Invalid item!");
        }

        scan.close();
    }
}
