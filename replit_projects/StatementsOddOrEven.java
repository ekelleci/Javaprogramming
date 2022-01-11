package replit_projects;
import java.util.Scanner;
public class StatementsOddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();

        String result="";

        if(number%2==0){
            result="Even";
        }else{
            result="Odd";

        }
        System.out.println(result);

    }
}
