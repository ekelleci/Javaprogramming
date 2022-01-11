package day37_Inheritance.Phone;

public class Phone {
    //  Variables:brand, model, size, price, color
    public String brand,model,size;
    public double price;
    public String color;
    public static boolean hasBattery;

    //Methods:  Constructor()

    public Phone(String brand, String model,
                 String size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }
    // call and text(long phoneNumber)
    public void call(long phoneNumber){

        System.out.println(phoneNumber+  brand + model+ " is calling");
    }
    public void text(long phoneNumber){
        System.out.println(phoneNumber+ brand + model+ " sent a text");

    }
    //toSting
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price= $ " + price +
                ", hasBattery='" + hasBattery + '\'' +
                '}';
    }
}
