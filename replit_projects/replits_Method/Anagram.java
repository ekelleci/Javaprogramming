package replit_projects.replits_Method;
import java.util.Scanner;
import java.util.Arrays;
public class Anagram {
    public static boolean isAnagram(String word1, String word2) {

        char[] ch1=word1.toCharArray();
        char[] ch2=word2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1,ch2);



    }

    // Do not touch below


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isAnagram(in.nextLine(), in.nextLine()));
    }

}

