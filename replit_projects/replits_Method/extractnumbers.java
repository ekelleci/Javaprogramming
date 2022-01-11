package replit_projects.replits_Method;
import java.util.Scanner;

public class extractnumbers {
    //extractNum("aaa32a") ==> 23 { a,a,3,2,a}
    public static String extractNum(String s) {
        String num=" ";



        for (char each:s.toCharArray()) {

            if (Character.isDigit(each)){
                num+=each;
            }
            
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(extractNum(in.next()));
    }
}