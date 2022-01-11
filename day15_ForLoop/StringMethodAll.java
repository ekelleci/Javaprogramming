package day15_ForLoop;

public class StringMethodAll {
    public static void main(String[] args) {

        String word = "  Cydeo ";
        char thirdChar = word.charAt(2);
        System.out.println(" Third char =" + thirdChar);
        System.out.println( " ___________________________________________");

        int word1 = word.length();
        System.out.println(" lenght of the word: " + word1);
        System.out.println( " ___________________________________________");

        word = word.toUpperCase();
        System.out.println( word);
        System.out.println( " ___________________________________________");


        word = word.toLowerCase();
        System.out.println(word);
        System.out.println( " ___________________________________________");

        String str = " Java is fun, I love learning Java";
        String str2=str.replace("Java","Pyhton" );

        System.out.println(str);
        System.out.println(str2);

        System.out.println( " ___________________________________________");

        String str1 = "    batch 25       ";
        str1 = str1.trim(); //"batch 25"
        System.out.println(str1);

        System.out.println( " ___________________________________________");

        String str3 = "Cydeo School";

        int n1 = str3.indexOf("h"); //8
        System.out.println("n1 = " + n1);
        int n2 = str3.indexOf("ool"); //9
        System.out.println("n2 = " + n2);

        System.out.println( " ___________________________________________");

        String str4 = "Java Programming language";

        int n5 = str4.lastIndexOf("g");
        System.out.println("n5 = " + n5);

        System.out.println( " ___________________________________________");

        String str5= " xcodeX";
        String result=str5.replace(" x","a").replace("X","a");
        System.out.println(result);


        System.out.println("___________________________________________________________________");

    }
}
