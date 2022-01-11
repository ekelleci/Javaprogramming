package replit_projects.replits_Method;
import java.util.Scanner;
public class ProfitOrLoss {
    public static String profits(int buyPrice,int sellPrice){
        //your code here
   String result="";

   if (buyPrice<sellPrice){
       result="profit";
   }else if (buyPrice>sellPrice){
       result="loss";
   }else{
       result="no loss";
   }
       return result;



    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(profits(in.nextInt(), in.nextInt()));
    }
}
