package day01_JavaIntro;
import Utilities.StringUtility;
public class test {
    public static void main(String[] args) {
        String str="Wooden Spoon";

        StringUtility.printEachChar(str);

        System.out.println("______________");
        String str2=" Neden geldim bu dunyaya";

        String result=StringUtility.reverse(str2);
        System.out.println(result);
        System.out.println("_______________");
        String word="Civic";
        boolean palindrome=StringUtility.isPalindrome(word);
        System.out.println(palindrome);

        String[]names={"anna","java","Python","racecar","mom"};

        int count=0;

        for (String each:names) {

            if(StringUtility.isPalindrome(each)){
                count++;
            }


        }
        System.out.println(count);

        System.out.println("______________");
        String remove="aaabbbaabbc";

        String result1=StringUtility.removeDuplicates(remove);

        System.out.println(result1);


    }

}
