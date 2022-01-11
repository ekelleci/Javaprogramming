package taskSolutions.day31;

public class day31_task1SalaryCalculator {

    //Attributes:   hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

    public double hourlyRate, stateTaxRate, federalTaxRate, weeklyHours;

    // Add a constructor to set all the fields
    public day31_task1SalaryCalculator(double hourlyRate, double stateTaxRate, double federalTaxRate, double weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }
    // salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
    public double Salary(){
        Double Salary=hourlyRate * weeklyHours* 52;
        return Salary;
    }

    // stateTax(): claculates the totalstateTax
    public double stateTax(){
        double stateTax=Salary()*stateTaxRate;
        return stateTax;
    }

    //federalTax(): calculates the total federal tax
    public double  federalTax(){
       double federalTax=Salary()*federalTaxRate;
       return federalTax;
    }

    //salaryAfterTax(): calculates the salary after tax
    public double salaryAfterTax(){
        double salaryAfterTax=Salary()-stateTax()-federalTax();
        return salaryAfterTax;
    }
    //toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object
    public String toString() {
        return "day31_task1SalaryCalculator{" +

                ", stateTax=" + stateTax() +
                ", federalTax=" + federalTax()+
                ", Salary After Tax=" + salaryAfterTax()+
                ", Salary= $" +Salary() +

                '}';
    }
    /*
1. SalaryCalculator Task:
		1.1 Create a class named Salary calculator:
		        Attributes:
		            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

	            Add a constructor to set all the fields

		        Actions:
		            salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
		            stateTax(): claculates the totalstateTax
		            federalTax(): calculates the total federal tax
		            salaryAfterTax(): calculates the salary after tax
		            toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object

 */
    //-----------------------------------TASK 2--------------------------------------------------------
    /*
    2. Address Task:
	2.1 Create a class named Address
		    Attributes:
		         buildingNumber, street, city, state, zipCode;

		   	Add a constructor to set all the fields

		    Actions
		            toString: returns the address
		                        EX:
		                            7925 Jones Branch Dr
		                            McLean Va, 22012

     */


}

