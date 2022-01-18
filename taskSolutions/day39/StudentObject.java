package taskSolutions.day39;

public class StudentObject {
    public static void main(String[] args) {

        GraduateStudent student1=new GraduateStudent("Emre",32,'M',123456,"SDET","Cydeo",'A');

        student1.study();

        Student student2=new Student("Alex",37,'M',23456,"QA","Cydeo",'B');

        student2.study();

        System.out.println(student1);
        System.out.println(student2);

    }
}
