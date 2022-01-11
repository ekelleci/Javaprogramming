package taskSolutions;
import java.util.Scanner;
public class day18_Star {
    public static void main(String[] args) {
        for (int j = 1; j <= 10; j++) {


            for (int i = 1; i <= 10; i++) {
                System.out.print(" "+(i*j));
            }
            System.out.println();
            /*
            1	2	3	4	5	6	7	8	9	10
			2	4	6	8	10	12	14	16	18	20
			3	6	9	12	15	18	21	24	27	30
			4	8	12	16	20	24	28	32	36	40
			5	10	15	20	25	30	35	40	45	50
			6	12	18	24	30	36	42	48	54	60
			7	14	21	28	35	42	49	56	63	70
			8	16	24	32	40	48	56	64	72	80
			9	18	27	36	45	54	63	72	81	90
			10	20	30	40	50	60	70	80	90	100
             */
            Scanner scan = new Scanner(System.in);

            while(true){

                System.out.println("Enter your age:");
                int age = scan.nextInt();

                while( !(age >= 1 && age <= 120)){ // while the age is invalid
                    System.err.println("Invalid Entry, Please re-enter your age");
                    age = scan.nextInt();
                }

                System.out.println("Would you like to continue?");
                String a =scan.next().toLowerCase();

                while( !(a.equals("yes") || a.equals("no")) ){ // while the answer is invalid
                    System.err.println("Invalid Entry, Please re enter. Would you like to continue?");
                    a =scan.next().toLowerCase();
                }

                if(a.equals("no")){
                    break;
                }

            }


        }}

}
