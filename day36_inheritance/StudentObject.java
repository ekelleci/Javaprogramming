package day36_inheritance;

public class StudentObject {
    public static void main(String[] args) {
        Student student1=new Student("Emre",2,'G','A',"Cydeo");
        //Can change the variables using Setter

        student1.setAge(5);

        System.out.println(student1);

    }
}
