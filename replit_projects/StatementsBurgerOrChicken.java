package replit_projects;

import java.util.Scanner;

public class StatementsBurgerOrChicken {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter your order");
        String in = s.next();

        //your code here
        double result = 1.0;
        switch(in){
            case "burger": case "chicken":
                result=10.0;
                break;

            case "soda":
                result=2.0;
                break;

            case "fries":
                result=3.5;
                break;
        }System.out.println(result);
        s.close();
    }
}
