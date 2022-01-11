package day15_ForLoop;

public class StringMethodAll2 {
    public static void main(String[] args) {

        String str = "       ";
        boolean r = str.isEmpty();
        System.out.println(r); // False

        System.out.println("_________________");

        boolean r1 = str.isBlank();
        System.out.println(r1); // True

        System.out.println("_________________");

        String s1 = "CYDEO";
        String s2 = "cydeo";

        System.out.println(s1.equals(s2)); // False
        System.out.println(s1.equalsIgnoreCase(s2)); // true

        System.out.println("_________________");

        String sentence = "My favorite programming language is Java";

        boolean hasCSharp =sentence.contains("C#");
        boolean hasJava = sentence.contains("Java");
        boolean hasJava2 = sentence.contains("java");

        System.out.println(hasCSharp); // false
        System.out.println(hasJava); // true
        System.out.println(hasJava2); // false

        System.out.println("_________________");

        String a = "Wooden Spoon"; //"wooden spoon"

        boolean x = a.startsWith("Woo");
        boolean y = a.endsWith("Spoon");
        boolean z = a.toLowerCase().startsWith("wooden");
        // in order to ignore the case sensitivity we first create the lower
        // case/upper case version of string and
        // then compare it with lowercase/uppercase

        System.out.println(x); //true
        System.out.println(y); // true

        System.out.println("_________________");

        String word = "Cydeo School";
        //             012345...

        String brand = word.substring(0, 4+1);
        System.out.println(brand); // Cydeo

        String str1 = word.substring(6);
        System.out.println(str1); // School

        System.out.println("_________________");

        String stra = "Cydeo";

        String strb = stra.repeat(4);
        System.out.println(strb);//"CydeoCydeoCydeoCydeo"

        System.out.println( "FADY\n".repeat(3) );
        //FADY
        //FADY
        //FADY





    }
}
