package day22_MultidimensionalArray;
import java.util.Arrays;
public class MultiDimensionalArray {
    public static void main(String[] args) {

        int[] arr1={1,2,3};
        int[] arr2={4,5,6};
        int[] arr3={7,8,9};

        int [][] arr2D={{1,2,3}, {4,5,6},{7,8,9}};

        // 3D Array
        // Index of elements 0 1 2    0 1 2   0 1 2      0  1  2   0  1  2    0  1  2
        int [][][] arr3D ={{{1,2,3}, {4,5,6},{7,8,9}},{{10,20,30},{40,50,50},{60,70,80}}};
        // index single Array     0                                 1
        // index 2nd D Array  0         1       2           0       1           2
        // Index of elements 0 1 2    0 1 2   0 1 2      0  1  2   0  1  2    0  1  2
        // [ index of 2D] [index of Single][index of element]

        System.out.println(Arrays.deepToString(arr3D));
        //[[[1, 2, 3], [4, 5, 6], [7, 8, 9]], [[10, 20, 30], [40, 50, 50], [60, 70, 80]]]
        // to get to
        System.out.println(Arrays.deepToString(arr3D[1]));
        //[[10, 20, 30], [40, 50, 50], [60, 70, 80]]
        //
        System.out.println(Arrays.toString(arr3D[1][1]));
        //[40, 50, 50]
        //
        System.out.println(arr3D[1][1][0]);
        //40
        //

        System.out.println("-------------------------------------------");
        for (int[][] each2D: arr3D) {
            for (int[] each1D: each2D ) {
                for (int element: each1D ) {
                    System.out.print(element+" ");

                }

            }

        }
        System.out.println();
        System.out.println("-------------------------------------");


    }
}
