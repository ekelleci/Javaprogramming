package day39_Recap_Inheritence_Encapsulation.WarmUp;

public class ShapeOfObjects {
    public static void main(String[] args) {
        Square square=new Square(10);
        /*System.out.println(square);
        // Invalid value: -10.0
        System.out.println("------------------"); */

        // square.side=20 you cannot call it like this since it is private
        square.setSide(20);
        System.out.println(square);

        System.out.println("---------------------------");
        Rectangle rectangle=new Rectangle(3,6);
        System.out.println(rectangle);

        System.out.println("---------------");
        Circle circle=new Circle(3);
        System.out.println(circle);
    }
}
