package replit_projects.replits_Method;
import java.util.Scanner;
public class StringRemoveDuplicate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(uniqueChars(in.next()));
    }

    public static String uniqueChars(String str) {
        //TODO: write your code

        String result="";

        for (int i = 0; i < str.length(); i++) {

            if (!result.contains(""+str.charAt(i))){
                result+=str.charAt(i);
            }
        }


        return result;


    }



}
