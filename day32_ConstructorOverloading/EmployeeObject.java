package day32_ConstructorOverloading;

public class EmployeeObject {
    public static void main(String[] args) {
        Employee employee1=new Employee("Emre");
        Employee employee2=new Employee("Semra",'F');
        Employee employee3=new Employee("Yigit",'M',"Engineer");
        System.out.println("employee1 = " + employee1);
        System.out.println("employee2 = " + employee2);
        System.out.println("employee3 = " + employee3);
    }
}
