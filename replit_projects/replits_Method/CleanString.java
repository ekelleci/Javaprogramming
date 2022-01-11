package replit_projects.replits_Method;
import java.util.Scanner;
public class CleanString {
    public static String clean (String text , String badWord) {

        String result="";


       result=text.replace(badWord,"");

       return result;


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(clean(in.nextLine(), in.nextLine()));
    }
}
