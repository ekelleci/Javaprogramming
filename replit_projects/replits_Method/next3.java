package replit_projects.replits_Method;
import  java.util.Scanner;
public class next3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter number");
        int num = inp.nextInt();

        next3(num);
    }
    public static void next3(int num){
        System.out.println("\nnext 3 are:");
        for(int i=num+1; i<=num+3; i++){
            // 6,7,8
            System.out.print(i+" ");
        } }
    // Do not touch above

    /*
        enter number
          10
       next 3 are:
         11  12  13
    */





   }




