package replit_projects;

import java.util.Scanner;

public class VariablesPatientInfo {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println( "Welcome to the patient portal");
        System.out.println("Please enter your personal information");

        System.out.println( "Enter your name");
        String name = input.nextLine();

        System.out.println( "Enter your last name");
        String lastName = input.nextLine();

        String FullName= name + lastName;

        System.out.println( "Enter your email");
        String email = input.nextLine();

        System.out.println("Enter your Street name ");
        String streetName = input.nextLine();

        System.out.println("Enter your SCity ");
        String city = input.nextLine();

        System.out.println("Enter your state ");
        String state = input.next();

        System.out.println("Enter zip code");
        int zipCode = input.nextInt();

        System.out.println("Enter your work phone");
        long workPhone= input.nextLong();

        System.out.println("Enter your personal phone");
        long personalPhone= input.nextLong();

        System.out.println("Enter your age");
        int age = input.nextInt();

        System.out.println("Enter your Weight");
        double weight=input.nextDouble();

        System.out.println("Enter your Height");
        double height=input.nextDouble();

        System.out.println("Are you married?");
        boolean Ismarried =input.nextBoolean();





        System.out.println("Patient Personal Information");
        System.out.println( "Full Name: "+ lastName+ ","+ name);
        System.out.println("Address: "+streetName+ ","+city+","+state+" "+zipCode);
        System.out.println("Contact Info: "+ "Work Phone"+ "-"+ workPhone+","+ "\n" +"Personal Number"+ "-"+personalPhone
                +","+"Email:"+email);
        System.out.println("Weight: "+ weight);
        System.out.println("Height: "+ height);
        System.out.println("Married:"+ Ismarried);














    }
}
