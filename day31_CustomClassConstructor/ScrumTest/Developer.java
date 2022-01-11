package day31_CustomClassConstructor.ScrumTest;

public class Developer {

    public String name;
    public int employeeID;
    public String JobTitle;
    public double Salary;

    public Developer(String name, int employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.JobTitle = jobTitle;
        this.Salary = salary;
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", JobTitle='" + JobTitle + '\'' +
                ", Salary= $" + Salary +
                '}';
    }

    public void coding(){
        System.out.println(name + " is coding");
    }
    public void unitTesting(){
        System.out.println(name+ " is unitTesting");
    }
    public void fixingBug(){
        System.out.println(name+ " is fixing bug");
    }

}
/*
create a class called Developer
	          Attributes:
	            name, employeeID, JobTitle, Salary

	          Add A constructor that can set all the fileds

	          Actions:
	            coding(), unitTesting(), fixingBug(), toString()
 */