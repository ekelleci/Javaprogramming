package replit_projects;
import java.util.Scanner;
public class StatementVehicleRecall {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter vehicle's year:");
        short year= s.nextShort();
        String result="";

        if(year>=1995 && year<=1998){
            result="Your vehicle needs to be recalled!";
        } else if ( year>=2001 && year<=2002){
            result="Your vehicle needs to be recalled!";
        }else if ( year>=2004 && year<=2006){
            result="Your vehicle needs to be recalled!";
        }else if ( year>=2015 && year<=2017){
            result="Your vehicle needs to be recalled!";
        }else {
            result = "Your vehicle is fine, enjoy!";
        }
        System.out.println(result);


    }
}
