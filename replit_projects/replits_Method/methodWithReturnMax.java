package replit_projects.replits_Method;
import java.util.Scanner;
public class methodWithReturnMax {
    public static int max(int x, int max){
        // Code here
        int result=0;
      if (x>max){
          result=x;
      }else {
          result=max;
      }

return result;


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(max(in.nextInt(), in.nextInt()));
    }
}
