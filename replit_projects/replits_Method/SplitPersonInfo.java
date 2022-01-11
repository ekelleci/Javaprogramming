package replit_projects.replits_Method;
import java.util.Scanner;
public class SplitPersonInfo {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s) ;
    }

    public static void person(String info) {
        //your code here
        // info ("jon,doe,30");
        //String[] sentences= { jon,doe,30}
        //                      0    1   2

        String[] sentences=info.split(",");

        System.out.println("Person name:"+sentences[0]);
        System.out.println("Person last name:"+sentences[1]);
        System.out.println("Person age:"+sentences[2]);

    }
    }
 /*
 Example:

 person("jon,doe,30");

 output:
 person name: jon
 last name: doe
 age: 30
  */