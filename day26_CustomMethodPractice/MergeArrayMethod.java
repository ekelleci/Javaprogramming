package day26_CustomMethodPractice;

import Utilities.ArrayUtility;

public class MergeArrayMethod {



    public static int[] mergeArrays(int []array1,int[] array2){
        // creating a result array that store same # of elements
        int [] result={};

        for (int each:array1){
            result=ArrayUtility.addElement(result,each);
        }
        for (int each:array2){
            result=ArrayUtility.addElement(result,each);
        }
        return result;
    }

}
