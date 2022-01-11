package day19_LoopPractices;

public class Uniquech {
    public static void main(String[] args) {

        String str="aabccdeef";
        String result=" ";  //bdf

        char ch='a';
        int count= 0; // frequency of ch a

        for (int i = 0; i < str.length(); i++) {

            char eachch=str.charAt(i);
            if (ch==eachch){
                count++;
            }

        }

        System.out.println(count);
    }
}
