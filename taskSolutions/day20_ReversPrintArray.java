package taskSolutions;

import java.util.Arrays;

public class day20_ReversPrintArray {
    public static void main(String[] args) {
        String [] names={"Emre Kelleci","Cagri Kahraman","Mustafa Yigit"};

        for (String each:names ) { // this gives you each name
            // to revers them i need for loop
            String reversed=" "; // temporary result
            for (int i = each.length()-1; i >=0 ; i--) { // reversing each ch
                reversed+=each.charAt(i); // adding reversed ch
            }
            System.out.println(reversed);
        }

        System.out.println("__________");
        // revering an array without loop
        int [] numbers={10,20,30,40,50}; // this is given array
        //       index   0 1  2  3  4

        int [] reversed=new int[numbers.length];//  temporary result


       /* reversed[0]=numbers[numbers.length-1]; // first index of reversed equals to last index of number
        reversed[1]=numbers[3];  // repeating statement
        reversed[2]=numbers[2];
        reversed[3]=numbers[1];
        reversed[4]=numbers[0]; */

        // we also can use for loop for repeating statements

        for (int i = numbers.length-1,j=0; i >= 0;j++, i--) {
            reversed[j]=numbers[i];
        }
        System.out.println(Arrays.toString(reversed));
    }
}
