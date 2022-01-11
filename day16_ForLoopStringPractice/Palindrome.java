package day16_ForLoopStringPractice;

public class Palindrome {
    public static void main(String[] args) {
        String word = "level";  //Original variable
        String reversed = ""; // Reversed version variable to compare

        for (int i = word.length() -1; i >=0 ; i--) { // get the letters from the word from the end
            reversed+=word.charAt(i); // print them

        }
         boolean isPolindrome= word.equalsIgnoreCase(reversed); // Compare the two version

        System.out.println("isPolindrome = " + isPolindrome); // Print the result


        /*
        "Java" ==> avaJ   not a palindrome
        Anna ==> annA  same palindrome
        Dad
        Mom
         */
    }
}
