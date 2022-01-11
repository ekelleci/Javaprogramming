package replit_projects;

import java.util.Scanner;

public class StatementAndroidVersion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter version");
        double version = input.nextDouble();
        String result=" ";

        if (version==1.5){
            result="Cupcake";
        }
        else if (version==1.6){
            result = "Donut";
        }
        else if (version==2.1){
            result="Eclair";
        }
        else if (version==2.2){
            result="Froyo";
        }
        else if (version==2.3){
            result="Gingerbread";
        }else{
            result="Sorry, I don't know this version!";
        }

        System.out.println(result);






    }
}
