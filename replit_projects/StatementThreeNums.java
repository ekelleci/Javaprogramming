package replit_projects;
import java.util.Scanner;
public class StatementThreeNums {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int n3 = s.nextInt();

        String result = " ";

        if (n1 > n2 && n1 > n3) {
            result = n1 + " is bigger ";

        } else if (n2 > n1 && n2 > n3) {
            result = n2 + " is bigger";

        } else if (n3 > n1 && n3 > n2) {
            result = n3 + " is bigger";


        }
        System.out.println(result);
    }
}
