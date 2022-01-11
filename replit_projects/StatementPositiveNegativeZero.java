package replit_projects;
import java.util.Scanner;
public class StatementPositiveNegativeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();

        String result = "";

        if (number>0) {
            result = "positive";
        } else if (number<0){
            result = "negative";

        }else{
            result="zero";
        }
        System.out.println(result);
    }
}
