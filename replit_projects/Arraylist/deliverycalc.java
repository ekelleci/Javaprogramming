package replit_projects.Arraylist;
import java.util.ArrayList;
import java.util.Scanner;
public class deliverycalc {
    public static int refuel_times(ArrayList<Integer> deliveries,int max_fuel) {
     int sum=0;

        for (int each:deliveries ) {
            sum+=each;
        }
         return (sum/max_fuel);


    }



    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int fuel = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(refuel_times(list, fuel));

    }

}
