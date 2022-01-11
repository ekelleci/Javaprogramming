package replit_projects;

import java.util.Scanner;

public class LoopWovels {
    public static void main(String[] args) {

        Scanner inp =new Scanner(System.in);
        String word= inp.next();


            String vowels = "";
            for (int i = 0; i < word.length(); i++) {
                //  if (word.contains("a") || word.contains("e") || word.contains("i") || word.contains("o") || word.contains("u")) {
                if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'a') {

                    vowels += word.charAt(i);

                }

            }
            System.out.println(vowels);








    }
}
