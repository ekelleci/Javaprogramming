package day24_CustomMethod_Returns;

public class ReturnDays {

    public static void main(String[] args) {
        String day = daysOfWeek(5);

        System.out.println(day);
    }


public static String daysOfWeek(int num){
    String result=" ";

    result=(num==1)?"Monday":(num==2)?"Tuesday":(num==3)?"Wednesday":(num==4)?"Thursday":(num==5)?"Friday"
            :(num==6)?"Saturday":(num==7)?"Sunday":"Invalid";

            return  result;
        }


    }
