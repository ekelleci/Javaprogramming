package replit_projects.replits_Method;
import java.util.Scanner;
public class Method6Unique {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i=0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);
    }

    public static void printUniqueNumbers(int[] nums){
        //WRITE YOUR CODE HERE

        for (int j = 0; j < nums.length; j++) {

            int element = nums[j]; //"Java"
            int frequency =0;
            for (int i = 0; i < nums.length; i++) { // finds the frequency of element from array
                if(nums[i]==element){
                    frequency++;
                }
            }

            if(frequency == 1){
                System.out.println(element);
            }


    }}
}
