package replit_projects.replits_Method;
import java.util.Scanner;
public class At3rdChar {
    public static String at3(String target,String word){
        String newString=target.substring(0,3)+word+target.substring(3);

        return newString;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(at3(in.next(), in.next()));
    }
}
