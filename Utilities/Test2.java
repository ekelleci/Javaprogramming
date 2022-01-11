package Utilities;
import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int []arr={1, 2, 6};


    }
    public boolean firstLast6(int[] nums) {


        boolean r=false;
        if (nums.length>1 && nums[0]== 6||nums[nums.length-1]==6){

            r=true;

        }else {
            r=false;
        }
        return r;

    }



}


