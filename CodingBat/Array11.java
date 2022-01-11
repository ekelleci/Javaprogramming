package CodingBat;
import  java.util.Arrays;
public class Array11 {

    /*
GGiven an int array length 2, return true if it contains a 2 or a 3.


has23([2, 5]) → true
has23([4, 3]) → true
has23([4, 5]) → false
     */

    public boolean has23(int[] nums) {
       boolean r=false;

        for (int each:nums) {
            if(each==2 ||each==3){
                r=true;
            }else{
                r=false;
            }

        }
        return r;
    }


}

