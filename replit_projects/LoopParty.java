package replit_projects;

import java.util.Locale;
import java.util.Scanner;

public class LoopParty {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // your code
        System.out.println("Please enter the guest name");
        String guest1 = input.nextLine();

        while(true){
            System.out.println("Do you want to add  a new guest");
            String a = input.next();

            if(a.equalsIgnoreCase("no")){
                break;
            }else if (a.equalsIgnoreCase("yes")){
                System.out.println("Please enter the guest name");
                guest1+= "," + input.next();
            }


        }

        System.out.println(guest1 );


    }
}