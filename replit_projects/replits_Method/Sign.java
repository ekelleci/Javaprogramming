package replit_projects.replits_Method;
import  java.util.Scanner;
public class Sign {
    public static void sign(int n){
        //your code here:

        if (n>0){

            System.out.println( n+" is positive");
        }else if(n<0){
            System.out.println(n+" is negative");
        }else{
            System.out.println(n+" is zero");
        }



    }


    // DO not change:
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        sign(n);

    }
}
