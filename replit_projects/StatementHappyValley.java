package replit_projects;

import java.util.Scanner;

public class StatementHappyValley {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter age");
        int age = scan.nextInt();
        String result=" ";

        switch (age){
            case 2:
                result = "todler";
                break;
            case 3: case 4: case 5:
                result = "early childhood";
                break;
            case 6: case 7:
                result = "young reader";
                break;
            case 8: case 9: case 10:
                result = "elementary";
                break;
            case 11: case 12:
                result = "middle";
                break;
            case 13:
                result = "impossible";
                break;
            case 14: case 15: case 16:
                result = "high school";
                break;
            case 17: case 18:
                result = "scholar";
                break;
            default:
                result="ineligible";




        }System.out.println(result);
        scan.close();
    }
}
