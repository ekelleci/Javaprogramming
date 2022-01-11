package day05_StringConcatenation;

public class MyCar {
    public static void main(String[] args) {

        /*
        1. Create a class called CarInfo.java
2. Declare the following variables:
1. year - short
2. make - String
3. model - String
4. miles - String
5. color - String
6. price - string

3. Use concatenation to print the full info of the car in
the following format:
Year Make Model, Miles, Color, Price.
Example:
2018 Toyota Camry, 50000 miles, Red, $19000.
         */

        short year = 2016;
        String make = "Toyota", color = "red", price = "$19000" , model = " Corolla";
        int miles =  60000;

        System.out.println( year + make + model + "," + miles + " miles" + "," + color + price);

    }
}
