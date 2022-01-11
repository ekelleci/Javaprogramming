package taskSolutions.day35;

public class Candy {

   //private variables:     brand (String), quantity (int), price (double), hasPeanuts (boolean)

    public String brand;
    public int quantity;
    public double price;
    public boolean hasPeanuts;

    /*
    Encapsulate All the private fields
                        (price of candy can not be set to negative)
                        (quantity of candy can not be set to zero or negative)
     */

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity<=0){
            return;
        }
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<0){
            return;
        }
        if (price == 0) {
            System.out.println("Free candy");
        }
        this.price = price;
    }

    public boolean isHasPeanuts() {
        return hasPeanuts;
    }

    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }
     /*
      Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)
      */
    public Candy(String brand, int quantity, double price, boolean hasPeanuts) {
        setBrand(brand);
        setPrice(price);
        setQuantity(quantity);
        setHasPeanuts(hasPeanuts);
    }

    //Extra methods: toString():  if the price is zero, print "free" instead of 0

    public String toString() {
        if (price == 0) {
            return "CandiesTask{" +
                    "brand='" + brand + '\'' +
                    ", quantity=" + quantity +
                    ", price= " + " free" +
                    ", hasPeanuts=" + hasPeanuts +
                    '}';
        } else {
            return "CandiesTask{" +
                    "brand='" + brand + '\'' +
                    ", quantity=" + quantity +
                    ", price=" + price +
                    ", hasPeanuts=" + hasPeanuts +
                    '}';
        }
    }
}
