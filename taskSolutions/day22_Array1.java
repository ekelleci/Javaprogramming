package taskSolutions;
import java.util.Arrays;
public class day22_Array1 {
    public static void main(String[] args) {
        /*
        1. Write a program that can reverse a two dimensional array (return new array)
		Ex:
			array = { {1,2,3}, {4,5,6}};
			output:
			reverse = { {6,5,4}, {3,2,1},};
         */
        int[] []arr= { {1,2,3}, {4,5,6}};

        for (int i = arr.length-1; i>=0 ; i--) {
            for (int j = arr[i].length-1; j >=0 ; j--) {
                System.out.print(arr[i][j]+" ");
            }
        }
        System.out.println();
        System.out.println("--------------------");
        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };

       String print1=" ", print2=" ",print3= " ";

        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {
                print1+=items[i][j]+"\t";
            }
            print1 += "\n";

            for (int j = items[i].length-1; j >=0 ; j--) {
                print2+=items[i][j]+"\t";

            }
            print2+="\n";

        }
        for (int i = items.length-1; i >=0 ; i--) {
            for (int j =0 ; j <items[i].length-1 ; j++) {
                print3+=items[i][j]+"\t";

            }
            print3+="\n";

        }

        System.out.println(print1);
        System.out.println(print2);
        System.out.println(print3);

        System.out.println("-------------------------------");

        String[] batch25Group1 = {"Jilil", "Aykhan", "Irene", "Yulia", "Muhtar"};
        String[] batch25Group2 = {"Riza", "Allison", "Fei zhou", "Ahmet", "Elena", "Mikael", "Muhtar"};
        String[] batch25Group3 = {"Fady", "Break", "Clock", "Cihad", "Muhtar"};

        String [][] batch25Group=new String[3][];
        batch25Group[0]=batch25Group1;
        batch25Group[1]=batch25Group2;
        batch25Group[2]=batch25Group3;

        System.out.println(Arrays.deepToString(batch25Group));


        String[] batch24Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
        String[] batch24Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
        String[] batch24Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};
        String [][] batch24Group=new String[3][];

        batch24Group[0]=batch24Group1;
        batch24Group[1]=batch24Group2;
        batch24Group[2]=batch24Group3;

        System.out.println(Arrays.deepToString(batch24Group));

        String [][][] CydeoStudents=new String[2][][];
        CydeoStudents[0]=batch25Group;
        CydeoStudents[1]=batch24Group;

        System.out.println(Arrays.deepToString(CydeoStudents));







    }
}
