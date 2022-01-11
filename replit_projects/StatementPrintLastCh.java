package replit_projects;
import java.util.Scanner;
public class StatementPrintLastCh {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String word = scan.next();
        char lastCh=word.charAt(0);


        System.out.println(lastCh);



    }
}
