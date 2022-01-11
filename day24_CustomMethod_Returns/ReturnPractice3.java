package day24_CustomMethod_Returns;

public class ReturnPractice3 {
    public static void main(String[] args) {
        String str= "aaaabbbesmjjjd";

       str=removeDub(str);

        System.out.println(str);
    }



    public static String removeDub (String str){
        String result=" ";

        for (int i = 0; i < str.length()-1; i++) {
           char each=str.charAt(i);

           if( !result.contains("" +each)){

               result+=each;

           }

        }

        return  result;

    }
}
