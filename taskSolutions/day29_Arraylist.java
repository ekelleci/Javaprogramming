package taskSolutions;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class day29_Arraylist {
    public static void main(String[] args) {
        //1. write a program that can swap the first and last elements of an ArrayList of Integers
        ArrayList<Integer>  list1=new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5,6,7));

        Collections.swap(list1,0,list1.size()-1);
        System.out.println(list1);
        System.out.println("________________________");
      /*
        2. Write a program that can move all the zeros to the last indexes of ArrayList

                    Ex:
                        list: {1,0,2,0,3,0,4,0}

                    output:
                        [1, 2, 3, 4, 0, 0, 0, 0]

         */
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));
        System.out.println(list);

        list.retainAll(Arrays.asList(1,2,3,4));
        list.addAll(Arrays.asList(0,0,0,0));

        System.out.println(list);

       /*
        3. Write a program that can extract the special characters, digits and letters from a string and stores
        them into separate ArrayLists of Characters
                Ex:
                    str = "ABCD123$%#@&456EFG!"

                output:
                    list1: {1, 2, 3, 4, 5, 6}
                    list2: {A, B, C, D, E, F, G}
                    list3: {$, %, #, @, &, !}
         */





        System.out.println("______________________");
        ArrayList<String>  list3=new ArrayList<>();
        String  str = "ABCD123$%#@&456EFG!";
        char[] s=str.toCharArray();

        ArrayList<Character>digit=new ArrayList<>();
        ArrayList<Character>letters=new ArrayList<>();
        ArrayList<Character>special=new ArrayList<>();

        for (char c : s) {
            if(Character.isDigit(c)){
                digit.add(c);
            }else if(Character.isLetter(c)){
                letters.add(c);
            }else{
                special.add(c);
            }
        }
        System.out.println("digit = " + digit);
        System.out.println("letters = " + letters);
        System.out.println("special = " + special);


        }

        }








