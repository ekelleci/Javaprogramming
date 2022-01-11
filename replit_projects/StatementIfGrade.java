package replit_projects;

import java.util.Scanner;

public class StatementIfGrade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your grade");
        int grade = scan.nextInt();

       String result="";


        if( grade>=90){
            result="Excellent";
        }else if( grade >=70 && grade<=90){
            result="good";

        }else if (grade>=60 && grade<70){
            result = "pass";
        }else{
            result = "fail";
        }

        System.out.println(result);

    }
}
