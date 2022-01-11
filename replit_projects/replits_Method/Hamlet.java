package replit_projects.replits_Method;
import java.util.Scanner;
public class Hamlet {
    public static boolean threeLocks(boolean a, boolean b, boolean c) {
      boolean r=true;

      if(a||b||c){
          r=true;
      }else{
          r=false;
      }
      return r;


    }//end threeLocks

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(threeLocks(in.nextBoolean(), in.nextBoolean(),in.nextBoolean()));
    }
}

