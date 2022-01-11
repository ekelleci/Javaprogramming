package day13_String;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {

        String word = "  Cydeo ";

        char thirdChar = word.charAt(2);

        System.out.println(" Third char =" + thirdChar);


        System.out.println( " ___________________________________________");



        String s1 = "Batch 25 is the best batch"; // There are 26 character

        int totalCh = s1.length();

        System.out.println( " Total character= " + totalCh);

       char lastCh=s1.charAt( s1.length()-1);

        System.out.println( " Last Charaxter=" + lastCh);

        System.out.println("_____________________________");

        String str = " emre kelleci";
        str = str.toUpperCase();

        System.out.println( str);

        String  s= " JAVA";
        s=s.toLowerCase();

        System.out.println(s);





    }
}
