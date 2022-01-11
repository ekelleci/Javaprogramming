package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {

        /*
        90~100 Excellent
        80~89 Great
        70~79 Good
        60~69 Passed
        0~ 59 Failed

        Pre condition: score must be btw 0 - 100
         */

        int score = 72;

        if (score >= 0 && score <= 100) {
            // ----------- else if condition -----------

            // 5 posibilities if the condition is meet
            if (score >= 90) { // && score <= score not using because checked in precondition
                System.out.println(" Excellent");
            } else if (score >= 80) { // (&& score <= 89 ) not necessery first condition covers above 90
                System.out.println(" Great");
            } else if (score >= 70) {
                System.out.println(" Good");
            } else if (score >= 60) {
                System.out.println(" Passed");
            } else {

                System.out.println(" Failed");
            }

            //  if ( score< 60){
            //                System.out.println( " Failed");


        } else { // if the score is not valid
            System.out.println(" in valid score");

        }
    }
}
