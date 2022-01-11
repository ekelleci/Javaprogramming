package replit_projects.replits_Method;
import  java.util.Scanner;
public class printUniqueNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i=0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);
    }
/*
Example:

input:[2, 5, 5, 6, 3, 6, 9, 34, 3]

output:
2
9
34
 */
    public static void printUniqueNumbers(int[] nums) {
        //WRITE YOUR CODE HERE

        for (int i = 0; i < nums.length; i++) {

            int element = nums[i];
            int frequency = 0;

            for (int j = 0; j < nums.length; j++) {

                if (nums[j] == nums[i]) {
                    frequency++;
                }
            }
            if (frequency == 1) {
                System.out.println(element);
            }


        }
    }}
