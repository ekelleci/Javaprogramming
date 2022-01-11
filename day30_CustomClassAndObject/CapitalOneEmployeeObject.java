package day30_CustomClassAndObject;

public class CapitalOneEmployeeObject {
    public static void main(String[] args) {
        Employee employee1=new Employee();
        Employee employee2=new Employee();
        Employee employee3=new Employee();
        Employee employee4=new Employee();
        Employee employee5=new Employee();
        
        employee1.setInfo("John",'F',25,2237,"Developer",true,100000);
        employee2.setInfo("mark",'M',27,2238,"QA",false,110000);
        employee3.setInfo("Emily",'F',35,2239,"Developer",true,120000);
        employee4.setInfo("Derick",'M',55,2236,"QA",false,135000);
        employee5.setInfo("Emre",'F',37,2235,"Manager",true,112000);
        
        Employee [] employees={employee1,employee2,employee3,employee4,employee5};
        
        int countFullTime=0;
        int countPartTime=0;
        double max=employees[0].salary;

        for (Employee employee:employees ) {
            
            if(employee.isFullTime){
                countFullTime++;
            }else{
                countPartTime++;
            }
            if(employee.salary>max);
            max=employee.salary;
        }

        System.out.println("countPartTime = " + countPartTime);
        System.out.println("countFullTime = " + countFullTime);
        System.out.println("max = " + max);

    }
}
