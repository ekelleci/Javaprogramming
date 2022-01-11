package replit_projects.Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayAverageTemp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        // DO NOT TOUCH ABOVE
        //TODO: Write your code below.

        int max=0;
        for (int i = 0; i < nums.length; i++) {

            if ( nums[i]>max){
                max=nums[i];
            }

        }

        System.out.println(max);
    }
}
