package day33_AccessModifiers;

public class EmployeeObject {
    public static void main(String[] args) {
        Employee employee1=new Employee();
        employee1.name="Ahmet";
        employee1.salary=123000;



        Employee employee2=new Employee();
        employee2.name="Yigit";
        employee2.salary=145000;

        Employee employee3=new Employee();
        employee3.name="AHSEN";
        employee3.salary=110000;


        System.out.println(employee1.name+ ": "+employee1.salary);
        System.out.println(employee2.name+ ": "+employee2.salary);
        System.out.println(employee3.name+ ": "+employee3.salary);
    }
}
