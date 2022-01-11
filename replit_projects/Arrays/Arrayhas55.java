package replit_projects.Arrays;
import java.util.Scanner;
public class Arrayhas55 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO Type your code below:

        String total=" ";
        for (int num5:nums ) {

            total+=num5;


            }

        if(total.contains("55")){

            System.out.println("true");




        }else{
            System.out.println(false);
        }

    }
}
