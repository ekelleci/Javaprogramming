package day35_Encapsulation.encapsulation;

public class personObject {
    public static void main(String[] args) {

        Person p1=new Person();
        p1.setName("Daniel");
        p1.setAge(28);

        System.out.println(p1.getName());
        System.out.println(p1.getAge());
    }
}
