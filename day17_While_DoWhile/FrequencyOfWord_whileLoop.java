package day17_While_DoWhile;

public class FrequencyOfWord_whileLoop {

    public static void main(String[] args) {
        String str="java java python python";

        int frequency=0;

        while (str.contains("java")){

            str=str.replaceFirst("java"," ");
            frequency++;

        }
        System.out.println(frequency);

        System.out.println("--------------");

        String sentece=" cat cat dog dog cat cat dot";
        int couunt=0;
        while (sentece.contains("cat")){

            sentece=sentece.replaceFirst("cat"," ");
            couunt++;
        }

        System.out.println(couunt);
    }
}
