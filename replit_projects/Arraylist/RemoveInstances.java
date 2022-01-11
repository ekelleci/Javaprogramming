package replit_projects.Arraylist;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class RemoveInstances {
    public static ArrayList<Integer> removeInst(ArrayList<Integer> r,Integer n) {

        // create a new array list to store the elements to return
        ArrayList<Integer> removeInst=new ArrayList<>();

        // use for each loop to access each element of the array r to compare with n,
        for (int each:r) {
            // create an if condition that get the elements that are not equal to n
        if( each!=n){

            // use add method to add the each elements comes from if condition
            removeInst.add(each);
            }
        }
        // return the new array list
        return removeInst;
    }

    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int n = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(removeInst(list, n));

    }
}
