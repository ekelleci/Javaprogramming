package replit_projects.replits_Method;
import java.util.Scanner;
public class printUniqueWords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] words = new String[size];
        for (int i = 0; i < size; i++) {
            words[i] = scan.next();
        }
        printUniqueWords(words);
    }

    public static void printUniqueWords(String[] words) {
        //WRITE YOUR CODE HERE
        for (int j = 0; j < words.length; j++) {

            String element = words[j]; //"Java"
            int frequency =0;
            for (int i = 0; i < words.length; i++) { // finds the frequency of element from array
                if(words[i].equals(element)){
                    frequency++;
                }
            }

            if(frequency == 1){
                System.out.println(element);
            }

        }

    }
}