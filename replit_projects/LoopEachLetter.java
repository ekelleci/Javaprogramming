package replit_projects;
import java.util.Scanner;
public class LoopEachLetter {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();
        //----------------

        for (char i = 0; i < word.length(); i++) {
            char ch=word.charAt(i);



            System.out.println(ch);
        }


    }
}
