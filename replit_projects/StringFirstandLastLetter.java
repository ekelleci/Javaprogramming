package replit_projects;
import java.util.Scanner;
public class StringFirstandLastLetter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String word = scan.next();
        char fisrtLetter=word.charAt(0);
        int lastchar=word.length()-1;

        char lastLetter=word.charAt(lastchar);


        System.out.println(fisrtLetter+","+lastLetter);
    }

}
