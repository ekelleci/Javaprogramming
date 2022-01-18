package day39_Recap_Inheritence_Encapsulation.WarmUp;

public class Circle extends Shape {

    // S1 add the variables and methods can not be inherited
    private double radius;
    public static double pi=3.14;

    // // Generate getters and setters since there is private var
    public double getRadius() {
        return radius;
    }
    // Create condition value for radius
    public void setRadius(double radius) {
        if( radius<=0){
            System.out.println(" invalid value");
            System.exit(0);
        }
        this.radius = radius;
    }
    // S2 using extend keyword to inherit from shape class
    // It will give compile error , you need to create constructor


    public Circle( double radius) {
        // name is circle for each object . Remove name variable from parameters
        super("Circle");
        // super (name)
        //this.radius = radius since we create conditions ;
        setRadius(radius);
    }

    // created overriden methods
    @Override
    public double area() {
        return radius*radius*pi;
    }

    @Override
    public double perimeter() {
        return 2*radius*pi;
    }

    // Create toString


    @Override
    public String toString() {
        return "Rectangle{" +
                "pi=" +pi+
                ", radius=" + radius+
                "area='" +area()+ '\'' +
                "perimeter='" +perimeter() + '\'' +
                '}';
    }
}

/*
Circle extends Shape:
		variables:
			radius
			pi (static)

		Encapsulate the field

		Add a constructor to set the filed

		area(): radius * radius * pi
		perimeter(): 2 * radius * pi
		toString(): r, pi, area, perimeter

 */