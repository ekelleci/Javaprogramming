package replit_projects;
import java.util.Scanner;
public class VariablesSchoolGrade {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        String subject1,subject2,subject3,subject4,subject5;
        double grade1, grade2, grade3, grade4, grade5;

        System.out.println(" Welcome to the grader");

        System.out.println("Please enter subject name number 1 and score for this subject");
        subject1 = input.next();
        grade1 = input.nextDouble();

        System.out.println("Please enter subject name number 2 and score for this subject");
        subject2 = input.next();
        grade2= input.nextDouble();

        System.out.println("Please enter subject name number 3 and score for this subject");
        subject3 = input.next();
        grade3 = input.nextDouble();

        System.out.println("Please enter subject name number 4 and score for this subject");
        subject4 = input.next();
        grade4 = input.nextDouble();

        System.out.println("Please enter subject name number 5 and score for this subject");
        subject5 = input.next();
        grade5 = input.nextDouble();

        String sum = subject1+"-"+grade1+","+subject2+"-"+grade2+","+subject3+"-"+grade3+","+subject4+"-"+grade4+","+subject5+"-"+grade5;
        Double average = (grade1+grade2+grade3+grade4+grade5)/5;

        System.out.println(" Summary: "+sum);
        System.out.println(" Your average score:"+average);
        System.out.println("Thank you for using the Grader!");
        System.out.println("Goodbye!");









    }
}
