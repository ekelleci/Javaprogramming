package replit_projects.replits_Method;
import java.util.Scanner;
import java.util.Arrays;
public class PopulateArray {
    public static int[] populate(int[] r) {
        // your codes here:
        int[] newArr=new int[r.length];
        for(int i=0;i<newArr.length;i++){
            newArr[i]=i+1;
        }
        return newArr;

    }


    // Do not change
    public static void main(String[] args) 	{
        int [] i= new int[new Scanner(System.in).nextInt()];
        i = populate(i) ;
        System.out.println(Arrays.toString(i));

    }
}
