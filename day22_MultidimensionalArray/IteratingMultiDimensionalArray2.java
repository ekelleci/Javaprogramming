package day22_MultidimensionalArray;
import java.util.Arrays;
public class IteratingMultiDimensionalArray2 {
    public static void main(String[] args) {
        int[][] arr2D = { {1,2,3} , {4,5,6,7}, {8,9,10,11,12}  };


        for (int i = arr2D.length-1; i >=0 ; i--) {
           // arr2D[i] that gets you each single dimensional array;

            for (int j = 0; j < arr2D[i].length; j++) {
               // j is index of elements from 0 to end

                System.out.print(arr2D[i][j]+" ");
            }

            System.out.println();
            /*
            8 9 10 11 12
            4 5 6 7
            1 2 3  */

        }

    }
}
