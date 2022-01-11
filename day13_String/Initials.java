package day13_String;

import java.util.Scanner;

public class Initials {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println( " Enter your name");
        String name= scan.next();

        System.out.println( " Enter your last name");
        String lastName=scan.next();

        char f= name.charAt(0);
        char l = lastName.charAt(0);

        String initial = "" + f+"."+l;


        System.out.println(" Enter your name="+name);
        System.out.println(" Enter your name="+lastName);
        System.out.println( " Initial = " + initial);

        scan.close();




    }
}
