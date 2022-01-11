package replit_projects;

import java.util.Scanner;

public class StatementsConditional {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the name");
        String name= inp.nextLine();
        String result="";


        switch(name){
            case "Chen":
                result="Teacher";
                break;
            default:
                result="Student";



        }System.out.println(result);
        inp.close();
    }
}
