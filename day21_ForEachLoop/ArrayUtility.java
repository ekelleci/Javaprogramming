package day21_ForEachLoop;
import java.util.Arrays;
public class ArrayUtility {
    public static void main(String[] args) {
        int[] num={1,2,3,4,5};
        // index   0 1 2 3 4

        // To print and array you need Array.toString method
        System.out.println(Arrays.toString(num));
        // When you want to print an element you dont use
        //Array.toString
        System.out.println(num[2]);

        System.out.println("---------------");
        int[] scores={87,45,63,89,23};
        // sort utility sort the array from smallest to biggest
        // if it is an string a~z
        System.out.println(Arrays.toString(scores));
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));
        // to find min and max number sort it first
        System.out.println("min number:"+scores[0]);
        System.out.println("max number:"+ scores[scores.length-1]);

        String[] names={"anna","zuhal","emre","bekir"};
        Arrays.sort(names);

        System.out.println(Arrays.toString(names));

        System.out.println("----------------");
        // equals method
        int []arr1={1,3,2};
        int []arr2={1,2,3};

        boolean r1=Arrays.equals(arr1, arr2);
        System.out.println(r1);

        System.out.println("-----------------------------------------------------");
        //"acb" , "bac"
        char[] ch1 = {'a', 'c', 'b'};
        char[] ch2 = {'b', 'a', 'c'};

        Arrays.sort(ch1); //{a, b, c}
        Arrays.sort(ch2); //{a, b, c}

        boolean anagram = Arrays.equals(ch1, ch2);

        System.out.println("anagram = " + anagram);


    }
}
