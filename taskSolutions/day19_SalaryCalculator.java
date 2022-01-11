package taskSolutions;

import java.util.Scanner;

public class day19_SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);


        while (true) {
            System.out.println("How much you make an hour");
            double hourlyRate = scan.nextDouble();

            if (hourlyRate < 0) {
                System.out.println("Invalid Entry for Hourly Rate");
                System.exit(0);
            }

            System.out.println("How many hours do you work per week?");
            double weeklyHour = scan.nextDouble();

            if (weeklyHour < 1 || weeklyHour > 144) {
                System.out.println("Invalid Entry for weekly hour");
                System.exit(0);
            }
            System.out.println("Enter your state tax rate");
            double stateTaxRate = scan.nextDouble();

            if (stateTaxRate < 1 || stateTaxRate > 10) {
                System.out.println("Invalid Entry for your state tax rate");
                System.exit(0);
            }

            double grossSalary = 52 * (hourlyRate * weeklyHour);
            double federalTax = grossSalary * 0.26;
            double stateTax = (stateTaxRate * grossSalary) / 100;
            double totalTax = stateTax + federalTax;
            double netIncome = grossSalary - totalTax;

            System.out.println("Gross Salary:" + grossSalary);
            System.out.println("Federal Tax:" + federalTax);
            System.out.println("State Tax:" + stateTax);
            System.out.println("Total Tax:" + totalTax);
            System.out.println("Net Income:" + netIncome);

            System.out.println("Would you like to continue?");
            String answer = scan.next();

            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                System.out.println("Invalid entry");
                System.exit(0);
            }

            if (answer.equalsIgnoreCase("no")) {

                System.out.println("Thank you for using Cydeo Salary Calculator APP");
                System.exit(0);
            }
        }


    }
}
