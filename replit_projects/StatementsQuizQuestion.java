package replit_projects;
import java.util.Scanner;
public class StatementsQuizQuestion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("what is the farthest planet in the solar system:" );
        System.out.println("a)venus" );
        System.out.println("b)pluto" );
        System.out.println("c)neptune" );

        String a = s.nextLine();
        String answerA = "a",
                answerB = "b",
                answerC = "c",
                result = "";

        if (a.equals(answerA)) {
            result = answerA + " is wrong";
        } else if (a.equals(answerB)) {
            result = answerB + " is correct";
        } else if (a.equals(answerC)) {
            result = answerC + " is wrong";
        } else {
            result = a + " is not a valid answer";
        }
        System.out.println(result);

    }

}
