package replit_projects.replits_Method;
import java.util.Scanner;
public class fibonnacinum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);
    }

    public static void fib(int num){
        //WRITE YOUR CODE HERE
        int num0=0;
        int num1=1;
        int result=0;

        for(int i=2;i<num;i++){
            result=num0+num1; // 0+1=1
            System.out.println(result);
            num0=num1; //num1=1
            num1=result; //num2=1
        }

        System.out.println("result = " + result);




    }

}
