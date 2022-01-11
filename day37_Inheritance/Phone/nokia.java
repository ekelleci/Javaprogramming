package day37_Inheritance.Phone;

public class nokia extends Phone{

    public nokia(String brand, String model,
                 String size, double price, String color) {
        super("Nokia", model, size, price, color);

    }
    public void selfDefense() {
        System.out.println(brand +" "+
                model + " can be used for self defense");
    }
}
