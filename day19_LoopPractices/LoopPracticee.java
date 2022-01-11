package day19_LoopPractices;

public class LoopPracticee {

    public static void main(String[] args) {
        String str = " aabbbgcca";
        String result= " "; // c 2
        for (int j = 0; j < str.length(); j++) {


        char ch=str.charAt(j);
        int frequency=0;

        for (int i = 0; i < str.length(); i++) {

            char each=str.charAt(i);

            if(ch==each){
                frequency++;
            }
        }

        if( frequency==2){
            result+=ch;
            result+=frequency;

        }


        }
        System.out.println(result);
    }
}
