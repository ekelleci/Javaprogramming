package replit_projects.Arraylist;
import  java.util.ArrayList;
import java.util.Scanner;
public class TimesTwo {

    //create your method below
    public static ArrayList<Integer> timesTwo(ArrayList<Integer> list){

        ArrayList<Integer> nums=new ArrayList<>();

        for (Integer each:list ) {
            nums.add(each*2);
        }
        return nums;

    }







    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(timesTwo(list));

    }
}
