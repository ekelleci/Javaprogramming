package taskSolutions.day35;
import java.util.ArrayList;
public class CandyFactory {
    public static void main(String[] args) {


      //Add five objects of candies
        Candy candy1=new Candy("ulker",5,-1,false);
        Candy candy2=new Candy("Eti",-2,1.4,true);
        Candy candy3=new Candy("Saray",4,2.5,false);
        Candy candy4=new Candy("Torku",3,3.2,false);
        Candy candy5=new Candy("Hazal",6,1.2,true);

        // Create an ArrayList of candies
        ArrayList<Candy> candyList = new ArrayList<>();

        candyList.add(candy1);
        candyList.add(candy2);
        candyList.add(candy3);
        candyList.add(candy4);
        candyList.add(candy5);
        //use for each loop to print the brand and price of each candy

        for (Candy each:candyList ) {
            System.out.println(each.getBrand()+" : "+each.getPrice());
        }
    }
}
/*
 1.2 Create a class named CandyFactory
                Create an ArrayList of candies
                Add five objects of candies
                use for each loop to print the brand and price of each candy

 */