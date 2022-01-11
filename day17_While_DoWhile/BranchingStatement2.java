package day17_While_DoWhile;

public class BranchingStatement2 {
    public static void main(String[] args) {

        for (char i = 'a'; i <= 'z'; i++) {


            if (i == 'f') {
                continue; // a b c d e g   countinue skips the f
            }
            System.out.print(i + " ");


        }
        System.out.println("--------------");

        for (int j = 0; j <= 10; j++) {

            if (j % 2 == 0) {

                continue;

            }
            System.out.println(j);

        }
        System.out.println("_---------------");
        for (int j = 0; j <= 10; j++) {

            if (!(j % 2 == 0)) {

                continue;

            }
            System.out.println(j);


        }
    }
}
