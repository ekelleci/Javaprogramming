package replit_projects.Arraylist;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveEveryOther {
    //create your method below

    public static ArrayList<String> removeEveryOther (ArrayList list){

        ArrayList<String>  result=new ArrayList<>();


        for (int i = 0; i < list.size(); i++) {

            if( i % 2!=0){

                result.add((String) list.get(i));
            }
        }
        return result;
    }
    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.next());
        }

        System.out.println(removeEveryOther(list));

    }
}
