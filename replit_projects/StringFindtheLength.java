package replit_projects;

import java.util.Scanner;

public class StringFindtheLength {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string");
        String word = scan.next();
         int Length=word.length();

        System.out.println(Length);
    }


}
