package replit_projects.replits_Method;
import java.util.Scanner;
public class mergeString {
    public static String mergeStrings(String one, String two) {
      String result="";

        for (int i = 0; i < one.length(); i++) {
            for (int j = 0; j < two.length(); j++) {
                result+=one.charAt(i)+two.charAt(j);
            }


        }
        return result;



    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(mergeStrings(in.next(), in.next()));
    }
}
