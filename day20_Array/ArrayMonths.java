package day20_Array;
import java.util.Arrays;
public class ArrayMonths {
    public static void main(String[] args) {

        String[ ] months={"January","February","March","April","May","June","July",
                "August","September","October","November","December" };

        System.out.println(Arrays.toString(months));

        int num=2;

        if (num< 1||num>12){

            System.err.println("Invalid Entry");
            System.exit(0);

        }

        System.out.println(months[num-1]);

    }
}
