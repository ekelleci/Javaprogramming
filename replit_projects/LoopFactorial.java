package replit_projects;

import java.util.Scanner;

public class LoopFactorial {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        // your code

       long result=1;

        for (int i = n; i >= 1; i--) {

            result *=i;
        }

        System.out.println(result);




    }

}
