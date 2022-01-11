package replit_projects.replits_Method;
import java.util.Scanner;
public class BiggerString {

        public static String bigger(String a ,String b){
            String result="";

            if (a.length()>b.length()){
                result=a;
            }else {
                result=b;
            }
            return result;

        }


        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println(bigger(in.next(), in.next()));
        }
    }

