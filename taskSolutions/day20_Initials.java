package taskSolutions;

public class day20_Initials {
    public static void main(String[] args) {
        /*

1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines

         */
        String [] names={"Emre Klleci","Cagri Kahraman","Mustafa Yigit"};

        for (String each:names ) { // this gives you each name
            String initial=each.charAt(0)+"."+each.charAt(each.indexOf(" ")+1);
        //        initial== fisrt ch index 0 + .+ index of first ch after " "
            System.out.println(initial);

        }
    }
}
