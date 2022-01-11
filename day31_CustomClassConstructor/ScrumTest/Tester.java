package day31_CustomClassConstructor.ScrumTest;

public class Tester {

    public String name;
    public int employeeID;
    public String JobTitle;
    public double Salary;

    public Tester(String name, int employeeId, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.JobTitle = jobTitle;
        this.Salary = salary;
    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeID +
                ", JobTitle='" + JobTitle + '\'' +
                ", Salary= $" + Salary +
                '}';
    }

    public void smokeTesting(){
        System.out.println(name+ "is smoke testing");
    }

    public void creatingTicket(){
        System.out.println(name+"is creating ticket");
    }


    /*
     Attributes:
	            name, employeeID, JobTitle, Salary

	        Add A constructor that can set all the fileds

	        Actions:
	           smokeTesting(),  creatingTicket(), dailyStandUp()
     */
}
