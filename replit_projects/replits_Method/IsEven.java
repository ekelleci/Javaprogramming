package replit_projects.replits_Method;
import java.util.Scanner;
public class IsEven {
    public static boolean isEven(int n) {
boolean r =false;
        if(n%2==0){
            r=true;
        }else{
           r=false;
        }
        return r;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isEven(in.nextInt()));
    }

}
