package replit_projects;

import java.util.Scanner;

public class StringFindaUser {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter full name");
        String name=scan.nextLine();

        String name1="Max Payne";
        String name2="Alan Wake";

        if( name.equalsIgnoreCase(name2)){
            System.out.println("User found!");

        }else if(name.equalsIgnoreCase(name1)){
            System.out.println("User found!");
        }else{
            System.out.println("User not found!");
        }
    }
}
