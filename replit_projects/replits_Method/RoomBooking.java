package replit_projects.replits_Method;
import  java.util.Scanner;
public class RoomBooking {
    public static boolean simpleRoomBook(boolean isAvailable,int month, int day, int year){
        // your code here
        if (!isAvailable || year!=2018 || (month==7 && (day>=1 && day<=8))) return false;
        return true;


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(simpleRoomBook(in.nextBoolean(), in.nextInt(), in.nextInt(), in.nextInt()));

    }
}
