package day20_Array;
import java.util.Arrays;
public class ArrayPractice {
    public static void main(String[] args) {
        //Store the elements: 10,20,30,40
        int[] numbers={10,20,30,40};

        System.out.println(Arrays.toString(numbers));
        System.out.println("-----------------");
        //create a variable that can contains 5 scores
        // result [10, 20, 30, 40]

        int[] score=new int[5];
        //System.out.println(Arrays.toString(score));
        // result [0, 0, 0, 0, 0]

        score[1]=85;
        score[score.length-1]=95;
        score[3]=75;
        score[0]=65;
        score[1]=55;
        System.out.println(Arrays.toString(score));

    }
}
