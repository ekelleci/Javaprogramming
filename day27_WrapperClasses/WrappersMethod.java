package day27_WrapperClasses;

public class WrappersMethod {
    public static void main(String[] args) {
        String str="123";
        // parse method converts String value into a int
       int num=Integer.parseInt(str);

        System.out.println( num+1);
        System.out.println(str+1);
        System.out.println("________________");

        String str2="12.7";

       double num2= Double.parseDouble(str2);

        System.out.println(num2+1);

        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        double max2=Double.MAX_VALUE;


        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("max2 = " + max2);

        System.out.println("_________________________");
        //ValueOf method converts an String to Wrapper

        String s2="123";
        Integer x=Integer.valueOf(s2);
        int y=Integer.valueOf(s2);

        System.out.println(s2);
        System.out.println(x);
        System.out.println(y);
        System.out.println("_______________");
        String s3="1.5";

        double z=Double.valueOf(s3);
        System.out.println(z);






    }
}
