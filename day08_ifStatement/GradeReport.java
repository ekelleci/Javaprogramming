package day08_ifStatement;

public class GradeReport {

    public static void main(String[] args) {
      /*....*/

        int grade= 85; // 0~100

        boolean a = grade >= 90 && grade <= 100;
        boolean b = grade >= 80 && grade <= 90;
        boolean c = grade >= 70 && grade <= 80;
        boolean d = grade >= 60 && grade <= 70;
        boolean f = grade >= 0 && grade <= 60;

        System.out.println( grade);

    }
}
