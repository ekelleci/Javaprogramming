package day31_CustomClassConstructor;

public class StudentObjects {
    public static void main(String[] args) {
        Students studenta=new Students("Yigit",7,'M','A',2345);
        Students studentb=new Students("Semra",30,'F','A',3737);

        System.out.println(studenta);
        System.out.println(studentb);
    }
}
