package replit_projects.replits_Method;
import java.util.Arrays;
import java.util.Scanner;
public class MethodAddToArray {

    // your codes here
    public static void add_to_r(int[] r,int n) {
        //create new array with one more position:


            // Step 1; Creating a result Array that can store 1 + element
            int[] result = new int[r.length + 1];
            // Step 2 is pulling each element from giving Array and assigned them to my result Array
            int i =0;
            for (int each : r) {
                result[i++] = each;
            }
           // Step 3 is assign the last element to the result
            result[i] = n;


        System.out.println(Arrays.toString(result));


    }







    // Do not change those lines
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt(), n = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ; i <=size-1; i++){
            arr[i]=inp.nextInt();
        }

        add_to_r(arr, n);

    }
}
