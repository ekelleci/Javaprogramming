package taskSolutions;

public class day24_MethodTask1 {

    public static void main(String[] args) {
        String Word=task1("aaabbesnxch");

        System.out.println(Word);
    }



    // 1. create a method that can remove duplicated characters from a string and returns the new value


    public static  String task1 (String str){
        String result=" ";

        for (int i = 0; i < str.length()-1; i++) {
            char each=str.charAt(i);

            if(!result.contains(""+each)){
                result+=each;


            }

        }

        return result;

    }
}
