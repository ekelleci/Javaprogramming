package replit_projects.replits_Method;
import  java.util.Scanner;
public class StringLimit {
    public static String limit(String text, int maxLength){
        // your code
        String result="";

        result=text.substring(0,maxLength);

        return result;




    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(limit(in.nextLine(), in.nextInt()));
    }
}
