package taskSolutions;

import java.util.Arrays;

public class day24_ReturnMethod_Task3 {

    public static void main(String[] args) {
        int[] numArray={1,2,3,4,5,6,7};
        int [] reverse=new int[numArray.length];
        reverse=reversed(numArray);

        System.out.println(Arrays.toString(reverse));


    }
    
    
    
    public  static int[] reversed(int[]array){
        int [] reverse=new int[array.length];

        String result=" ";

        for (int i =array.length ,j=0; i>0; i--,j++) {

            reverse[j]=array[i];





        }
        return reverse;

        
    }


}
