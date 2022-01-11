package replit_projects.Arraylist;
import java.util.ArrayList;
import java.util.Scanner;

public class CombineAll {
    //create your method below
    public static ArrayList<Integer> combineAL(ArrayList<Integer> list, ArrayList<Integer>  list2) {
        // create a new array to store both array elements
        ArrayList<Integer> list3 = new ArrayList<>();

        // using for eaach loop to access the elements of list
        for ( Integer each:list) {
            // using add method to add them to list3
            list3.add(each);

        }
        for ( Integer each:list2) {
            list3.add(each);
        }
        return list3;
    }


    // Do not touch below


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int size2 = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }
        for(int i=0; i < size2; i++) {
            list2.add(in.nextInt());
        }

        System.out.println(combineAL(list, list2));

    }
}
