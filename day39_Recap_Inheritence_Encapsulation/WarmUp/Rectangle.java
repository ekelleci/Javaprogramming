package day39_Recap_Inheritence_Encapsulation.WarmUp;

public class Rectangle  extends Shape{

    // S1 add the variables and methods can not be inherited

    private double length,width;

    // Generate getters and setters
    public double getLength() {
        return length;
    }

    // create condition for length value
    public void setLength(double length) {
        if( length <=0){
            System.out.println(" invalid value");
            System.exit(0);
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    // create condition for width value
    public void setWidth(double width) {
        if( width <=0){
            System.out.println(" invalid value");
            System.exit(0);
        }
        this.width = width;
    }

    // S2 using extend keyword to inherit from shape class
    // It will give compile error , you need to create constructor


    public Rectangle(double length, double width) {
        // name is rectangle for each object . Remove name variable from parameters
        super("rectangle");
        // super(name)
        /*
        this.length = length;
        this.width = width;  since we create conditions */
        setLength(length);
        setWidth(width);

    }

    // created overriden methods

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }

    // Create toString


    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                "area='" +area()+ '\'' +
                "perimeter='" +perimeter() + '\'' +
                '}';
    }
}
/*
Rectangle extends Shape:
	variables:
		length
		width

	Encapsulate the fields

	Add a constructor to set the filed

	area(): length * width
	perimeter(): 2 * ( width + length)
	toString(): length, width, area, perimeter

 */