package day29_ArrayListCont;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Ali", "Ahmet", "Jimmy", "Aron", "Ali"));
    employees.retainAll(Arrays.asList("Ahmed","ali"));
        System.out.println("employees = " + employees);
        System.out.println("_________________________________________________");
        String[] names={"Mary","Monica","Sumeyra","Hasan"};
        // Remove the names that starts with M.

        ArrayList<String> list=new ArrayList<>(Arrays.asList(names));
        // Creating String to Arraylist
        list.removeIf(p->  p.charAt(0)=='M');
        // Above condition removes the names that has index as M
        names=list.toArray(new String[0]);
        System.out.println(Arrays.toString(names));
    }
}
