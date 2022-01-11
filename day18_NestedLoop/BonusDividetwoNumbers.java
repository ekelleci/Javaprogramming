package day18_NestedLoop;

public class BonusDividetwoNumbers {
    public static void main(String[] args) {
        int a=30;
        int b=7;

        int count=0; //

        while (a>=b){ // loop will stop when b>a

            a-=b;// keep substracting b from a
            count++; // each time you substract, increase the count by 1
        }

        System.out.println(count +  " whith a remainder"+ a);


        /*
        Write a program that can divide two positive numbers without using
         / (division) and * (multiplication) operators.

         a-b= 30 --> count +1
         a-b=23 --> count 1 +1
         a-b=16 --> count 2 +1
         a-b=9 --> count 3 +1
         a = 2 --> count 4
         I can substract b from a 4 times. this is the division.
         */
    }
}
