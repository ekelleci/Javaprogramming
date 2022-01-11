package replit_projects;
import java.util.Scanner;
public class StringPrintHalfTwice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();
        String halfWord=" ";

        for (int i = 0; i < (word.length()-1)/2; i++) {
            halfWord+=word.charAt(i);

            System.out.println(halfWord+halfWord);

        }

    }
}
