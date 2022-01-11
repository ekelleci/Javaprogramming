package replit_projects.replits_Method;
import java.util.Arrays;
import java.util.Scanner;
public class FindMax {
    // Write your code here

    public static int findMax( int [] numbers){

        Arrays.sort(numbers);

        return numbers[numbers.length-1];


    }

    public static double findMax(double [] numbers){
        Arrays.sort(numbers);

        return numbers[numbers.length-1];

    }

// DO NOT TOUCH THE MAIN METHOD

    public static void main(String [] args) {

        Scanner in = new Scanner(System.in);
        boolean runInt = in.nextBoolean();
        int size = in.nextInt();

        if(runInt) {
            int [] arr = new int[size];
            for(int i=0; i < arr.length; i++) {
                arr[i] = in.nextInt();
            }
            System.out.println(findMax(arr));
        } else {
            double [] arr = new double[size];
            for(int i=0; i < arr.length; i++) {
                arr[i] = in.nextInt();
            }
            System.out.println(findMax(arr));
        }

    }
}
