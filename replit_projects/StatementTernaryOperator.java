package replit_projects;
import java.util.Scanner;
public class StatementTernaryOperator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number1:");
        int num1 = scan.nextInt();
        System.out.println("Enter number2:");
        int num2 = scan.nextInt();

        String result   = (num1>num2)? num1+" is greater" :num2+" is greater";

        System.out.println(result);




    }
}
