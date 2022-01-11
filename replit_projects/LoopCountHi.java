package replit_projects;

import java.util.Scanner;

public class LoopCountHi {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String str= scan.nextLine();

        String str2 = "";
        int count = 0;

        for(int i = 0; i < str.length()-3; i++){
            str2 = str.substring(i, i+4);
            if(str2.contains("java")){
                str.replaceFirst("java", "");
                count++;
            }
        }
        System.out.println(count);
        scan.close();


    }
}
