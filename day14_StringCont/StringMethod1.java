package day14_StringCont;

public class StringMethod1 {
    public static void main(String[] args) {

        String str1 = "    batch 25       ";
        str1 = str1.trim(); //"batch 25"

        System.out.println(str1);

        String str2 = "Cydeo School";

        int n1 = str2.indexOf("h"); //8
        System.out.println("n1 = " + n1);

        int n2 = str2.indexOf("ool"); //9
        System.out.println("n2 = " + n2);

        String str3 = "Java Programming language";

        int n3 = str3.indexOf("an");

        System.out.println("n3 = " + n3);

        int n4 = str3.indexOf("gua");

        System.out.println("n4 = " + n4);

        int n5 = str3.lastIndexOf("g");

        System.out.println("n5 = " + n5);




    }



}
