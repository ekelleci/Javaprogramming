package replit_projects.replits_Method;
import java.util.Scanner;
public class isError {
    public static boolean isError(String line) {
    boolean r=false;
    String str=line.substring(0,5);

    if (str.equals("error")){
        r=true;
    }else{
        r=false;
    }

return r;


    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isError(in.nextLine()));
    }
}
