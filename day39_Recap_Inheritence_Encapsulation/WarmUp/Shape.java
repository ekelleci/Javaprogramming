package day39_Recap_Inheritence_Encapsulation.WarmUp;

public class Shape {

    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        // set conditions p
        if(name == null){
            System.err.println("Name can not be null");
            System.exit(1); // 1: some thing went wrong
        }
        if(name.isEmpty() || name.isBlank()){
            System.err.println("Invalid name");
            System.exit(1);
        }
        this.name = name;
    }
    public Shape(String name) {
        setName(name);
    }
    public double area(){
        // returns 0 as a tep value to override
        return 0;
    }

    public double perimeter(){
        // returns 0 as a tep value to override
        return 0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                "area='" +area()+ '\'' +
                "perimeter='" +perimeter() + '\'' +
                '}';
    }
}
/*
	Shape:
	variables:

			name
	Encapsulate the field
	Add a constructor to set the filed
	Methods:
		area(){}
		perimeter(){}
 */
