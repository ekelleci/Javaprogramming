package day33_AccessModifiers;

public class studentObject {
    public static void main(String[] args) {
        student student1=new student("Ahmet");
        student student2=new student("Yigit",'M');
        student student3=new student("Semra",'F',23);

        System.out.println("student2 = " + student2);
        System.out.println("student1 = " + student1);

        student[] students={student1,student2,student3};
    }

}
