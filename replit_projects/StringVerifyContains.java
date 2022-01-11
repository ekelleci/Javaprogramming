package replit_projects;
import java.util.Scanner;
public class StringVerifyContains {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your sentence");
        String word1 = scan.nextLine();
        String word2 = scan.nextLine();

        int num1=word1.length();
        int num2=word2.length();

        if (num1>num2){
            System.out.println(word1);
        }else{
            System.out.println(word2);
        }

    }
}
