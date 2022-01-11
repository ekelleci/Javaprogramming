package day08_ifStatement;

public class LogicalOperators {

    public static void main(String[] args) {

        String name = " Aaron",
                 citizen = " USA";

        int age = 18 ;

        boolean isEligible = age >= 18 && citizen == " USA ";
        //
        //

        System.out.println( name + " is eligible to vote:" + isEligible ) ;

        System.out.println( " -----------------------------------------------");


        String name2 = " Emre";
         int creditScore = 500;
         int age2 = 17;
         int income = 400000;

         boolean isEligible2 = creditScore >= 700 && age2>=21 && income >= 500000 ;

        System.out.println( name2 + " is eligible to apply for a loan :" + isEligible2);

        System.out.println( " ------------------------------------------------------------------------");

        String name3 = " Shay";
        int age3 = 21;
        char gender ='F';

        boolean isEligible3 = age3>= 18 && ( gender == 'M' || gender == 'F');
        //                     21 >= 18  && (   'F' == ' M ' ||  'F' == ' F '
        //                         true  &&  ( false || true)
        //                          true && true
        //                              true

        System.out.println( name3 + " is eligible to register : " + isEligible3);


        System.out.println( " __________________________________________________________________");


        boolean result2 = true;

        System.out.println( " result2 =" + result2);

        boolean result3 = !result2;

        System.out.println( "result3 =" + result3 );





    }
}
