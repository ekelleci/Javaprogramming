package day34_GarbageCollaction_AccessModifiers;

import java.util.ArrayList;

public class Circle {

    // instance
    public double radius;
    //static
    public static double pi;

    public double area;{
       area=radius*radius*pi;
    }

    /* static methhod contains only
            static variable pi*/
    public static double valueOfPi;{
        System.out.println(pi);
    }
    public static String name="Circle";

    public static ArrayList<Integer> numbers;


    public Circle(double radius){
        this.radius=radius;

    }
    static {
        pi=3.14;
        name ="Circle";
        numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
    }

}
