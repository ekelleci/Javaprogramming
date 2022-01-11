package replit_projects.replits_Method;

import java.util.Scanner;
public class getDuplicates {


    public static int getDup(String[] r) {

        int count=0;
        for (int i = 0; i < r.length; i++) {
            for (int j = i+1; j < r.length; j++) {
                if (r[i].equals(r[j])){

                    count++;
                }
            }
        }


        return count;


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] strs = new String[in.nextInt()];
        for(int i=0; i < strs.length; i++) {
            strs[i] = in.next();
        }

        System.out.println(getDup(strs));

    }

}