package replit_projects;
import java.util.Scanner;
public class StatementConsoleMenu {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("---------------");
        System.out.println("select an option:");
        System.out.println("1) option 1");
        System.out.println("2) option 2");
        System.out.println("3) option 3");
        System.out.println("---------------");

        int choice = s.nextInt();

        String result = " ";
        switch(choice) {
            case 1:
                result = "user selected 1";
                break;

            case 2:
                result = "user selected 2";
                break;

            case 3:
                result = "user selected 3";
                break;
        }System.out.println(result);
        s.close();

    }
}
