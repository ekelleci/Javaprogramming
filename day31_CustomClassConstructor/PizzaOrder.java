package day31_CustomClassConstructor;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaOrder {
    public static void main(String[] args) {


        // create 100 pizza objects: size-S , cheese t 2, pepperoni t 3.
        // create 100 pizza objects: size-M , cheese t 3, pepperoni t 4.
        // create 100 pizza objects: size-L , cheese t 4, pepperoni t 5.


        ArrayList<Pizza> pizzas = new ArrayList<>();
        for (int i = 0; i < 100; i++) {

            Pizza small=new Pizza('S',2,3);
            Pizza Medium=new Pizza('M',3,4);
            Pizza Large=new Pizza('L',5,6);
            
            // Adding all pizza orders to an array list
            pizzas.addAll(Arrays.asList(small,Medium,Large));

        }
        System.out.println("Total pizza="+pizzas.size());
        //Total pizza=300
        
        // caltulating the cost
        double totalPrice=0;

        for (Pizza pizza:pizzas) {
            totalPrice+=pizza.calcCost();
            
        }
        System.out.println("totalPrice = " + totalPrice);
        //totalPrice = 8200.0
    }
}
