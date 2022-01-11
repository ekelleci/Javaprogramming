package day10_NestedIf;

import com.sun.source.tree.IfTree;

public class NestedIfIntro {

    public static void main(String[] args) {
        int age = 25; // age to buy alcohol
        boolean hasId = true;

        if (hasId) { // If he has ID pre conditioin

            if (age >= 21) {  //

                System.out.println(" Eligible to buy");
            } else {
                System.out.println(" Not eligible");
            }
        } else { // if the person doesnt have an ID

            System.out.println(" you must have an ID");
        }


        System.out.println(" _______________________________________________");

        int number = 25;


        if(number >= 1 && number<= 7){ // if the number is a valid number (1~7)

            if(number == 1){
                System.out.println("Monday");
            }else if(number == 2){
                System.out.println("Tuesday");
            }else if(number == 3){
                System.out.println("Wednesday");
            }else if(number == 4){
                System.out.println("Thursday");
            }else if(number == 5){
                System.out.println("Friday");
            }else if(number == 6){
                System.out.println("Saturday");
            }else{
                System.out.println("Sunday");
            }

        }else{ // if the number is not valid
            System.out.println("Invalid Number");
        }


    }




        }





