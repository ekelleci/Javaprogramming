package day12_Scanner;


import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println( "Enter your age ");
        int age = input.nextInt();//Enter

        input.nextLine();

        System.out.println( " Enter your name");
        String fullName = input.nextLine();

        System.out.println( " Enter your GPA");
        double gpa= input.nextDouble();

        input.nextLine();

        System.out.println( "School Name");
        String schoolName=input.nextLine();

        System.out.println( " age="+ age);
        System.out.println( " Full Name="+ fullName);
        System.out.println( " GPA=" + gpa);
        System.out.println( " School Name=" + schoolName);







    }




}
