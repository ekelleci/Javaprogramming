package day26_CustomMethodPractice;

import Utilities.ArrayUtility;

import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7};

        int[] arr3 = ArrayUtility.merge(arr1, arr2);

        System.out.println(Arrays.toString(arr3));

    }
}
