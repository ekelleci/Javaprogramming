package day25_CustomMethod_Overloading;
import java.util.Scanner;
public class WordCount {
    public static int wordCount(String words) {
        // your code
         int count=0;
        String [] newarr=words.split(" ");

        count=newarr.length;

        return count;



    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(wordCount(in.nextLine()));
    }
}
