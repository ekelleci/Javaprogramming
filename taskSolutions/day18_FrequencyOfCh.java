package taskSolutions;

public class day18_FrequencyOfCh {
    public static void main(String[] args) {

        String str = "aabbscce"; //variable
        String result = " "; // a2b2s1c2e1

        for (int j = 0; j < str.length(); j++) {


            char ch = str.charAt(j); // converting index num to character.
            int count = 0;

            for (int i = 0; i < str.length(); i++) {// creating a loop to check each character by using I index

                char each = str.charAt(i); // each character in the string

                if (ch == each) { // if a equals to each ch, .
                    count++;     //increase the count by 1
                }
            }
                if (result.contains(" " + ch)) {

                continue;



            }
        result += ch;
        result += count;
        }

            System.out.println(result);


    }
}
