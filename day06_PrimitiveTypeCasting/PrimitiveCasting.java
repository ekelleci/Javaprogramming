package day06_PrimitiveTypeCasting;

public class PrimitiveCasting {

    public static void main(String[] args) {
        byte  a = 100;
        short b = a;

        System.out.println( a+ " : " + b);

        long x = 1000000;
        short y = ( short) x;

        System.out.println( x+ " : " + y);




    }
}
