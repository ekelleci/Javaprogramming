package day17_While_DoWhile;

public class FrequencyOfWord2 {
    public static void main(String[] args) {
        String str = " Cat Cat Cat Dog Dog";
        int frequency= 0; // frequency of the word
        // to aviod creating all possible substrings create a loop
        for (int i = 0; i < str.length()-3; i++) { // -3 for max i to create substrings
            String eachSub = str.substring(i, i + 4);

            if (eachSub.equalsIgnoreCase("cat")) {

                frequency++;
            }


        }
        System.out.println(frequency);
    }
}
