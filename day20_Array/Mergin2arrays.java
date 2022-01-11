package day20_Array;

import java.util.Arrays;

public class Mergin2arrays {
    public static void main(String[] args) {
        String[] group1={ "Emre","Semra","Yigit","Ahsen","Kerem"};
        String[] group2={"Bayram","Selvi","Zeynep","Esra","Muhammed"};
        // Combine above two arrays

        String[] family=new String[group1.length+ group2.length];
        // making sure the final array have enough capacity -length-

        int i=0; // index number of family

        for (String each:group1) {// getting each element from g1
            family[i++]=each; // assign them to the family variable
        }
        for (String each:group2) {// getting each element from2
            family[i++]=each;// assign them to the family variable

        }

        System.out.println(Arrays.toString(family));


    }
}
