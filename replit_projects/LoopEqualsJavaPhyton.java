package replit_projects;

import java.util.Scanner;

public class LoopEqualsJavaPhyton {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        int countOfCats=0;
        int countOfDogs=0;

        String str2 = "";
        int count = 0;
        int count2=0;


        for (int i = 0; i < sentence.length() - 2; i++) {
            str2 = sentence.substring(i, i + 3);
            if (str2.contains("cat")) {
                sentence.replaceFirst("cat", "");
                count++;
                countOfCats=count;

            }


        }

        for (int i = 0; i < sentence.length() - 2; i++) {
            str2 = sentence.substring(i, i + 3);
            if (str2.contains("dog")) {
                sentence.replaceFirst("dog", "");
                count2++;
                countOfDogs=count2;

            }


        }
        if (countOfCats==countOfDogs){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
   }
