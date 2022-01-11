package day30_CustomClassAndObject;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {
    public static void main(String[] args) {
        Car car1=new Car();
        car1.setInfo("Toyota","Corolla","Gray",2016,18000);

        System.out.println(car1);

        Car car2=new Car();
        car2.setInfo("dodge","caravan","Gray",2016,14000);

        System.out.println(car2);

        Car car3=new Car();
        car3.setInfo("Toyota","Matrix","Red",2006,5400);
        System.out.println(car3);


        //You  can use arraylist to store all those abjects
        // Arraylist better than array because size is flexible
        //Car[] cars={car1,car2,car3};

        ArrayList<Car> carList=new ArrayList<>();
        carList.addAll(Arrays.asList(car1,car2,car3));
        // getting info from the array list
        // Iterateing by loop

        for (Car each:carList ) {

            System.out.println(each.brand+":"+each.price);

            /*
            Recall list
            Dodge: 2005-2008
            Toyota: 1995-1997

             */

        }
        System.out.println("______________________");

        carList.removeIf(p-> p.brand.equals("Dodge") && p.year>=2005 && p.year<=2008);
        carList.removeIf(p-> p.equals("Toyota") && p.year>=1995 && p.year<=1997);
    }
}
