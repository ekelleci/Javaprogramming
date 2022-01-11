package day24_CustomMethod_Returns;

public class ReturnPractice {

    public static void main(String[] args) {
        String str=grade(60);

        System.out.println(str);
    }





    public static String grade(int score){
        String result=" ";

        if( score<0 && score>100){
            result="invalid";
        }else{
            result= (score>=90)? "A":(score>=80)?"B":(score>=70)?"C":(score>=60)?"D":"F";
        }
         return result;
    }
}
