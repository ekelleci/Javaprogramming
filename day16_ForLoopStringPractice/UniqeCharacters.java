package day16_ForLoopStringPractice;

public class UniqeCharacters {
    public static void main(String[] args) {

        String str ="aabbscce"; //variable
        String reslut=" "; // temporary variable

        for (int i = 0; i <str.length() ; i++) {// creating a loop to check each character by using I index
            char ch=str.charAt(i); // converting index num to character.

        }

        char ch = 'b';
        if ( str.indexOf(ch)==str.lastIndexOf(ch)) { // checking to see if string contains one time
            reslut += ch;
        }
        System.out.println( reslut);


    }


}
/*
Write a program that can return the unique characters from a String

            Ex:
                input:
                    AABCCD

                output:
                    BD

            Hint: You will need indexOf() and lastIndexOf()
                  if the first and last index numbers of the character are same, then it's unique
 */