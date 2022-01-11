package day29_ArrayListCont;

import java.util.ArrayList;

public class ArrayListPracticeMaxandMin {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        System.out.println(list);
        // Creating max variable and assing the first number (index0)
        int max=list.get(0);
        int min=list.get(0);
        // crete for each loop to check each element
        for (Integer each:list ) {
            //create a condition that assigns the number to max if it is bigger than mx
            if(each>max){
                max=each;
            }
            if(each<min){
                min=each;
            }

        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
