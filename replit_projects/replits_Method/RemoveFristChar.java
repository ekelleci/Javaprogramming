package replit_projects.replits_Method;
import java.util.Scanner;
public class RemoveFristChar {
    public static String removeFirst(String target) {
        String result="";
        result=target.substring(1,target.length());

        return result;


    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(removeFirst(in.next()));
    }
}
