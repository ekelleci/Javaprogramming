package day39_Recap_Inheritence_Encapsulation.WarmUp;

public class Square extends Shape {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side<=0){
            System.out.println(" Invalid value: "+side);
            System.exit(0);
        }
        this.side = side;
    }

    public Square( double side) {
        // Since the name is square for all squares
        //super(name);
        super("Square");
        // this.side = side;
        //  Since we create a condition we need to use setter call the name
        setSide(side);
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return 4*side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                "area='" +area()+ '\'' +
                "perimeter='" +perimeter() + '\'' +
                '}';
    }
}
