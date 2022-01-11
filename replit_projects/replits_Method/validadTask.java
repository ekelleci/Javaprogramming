package replit_projects.replits_Method;
import  java.util.Scanner;
public class validadTask {
    public static boolean validateTask(boolean notEmpty,int taskId,int currentId){
        // your code here
        if (!notEmpty && !(taskId==currentId+1)) return false;
        return true;




    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(validateTask(in.nextBoolean(), in.nextInt(), in.nextInt()));
    }
}
