package day21_ForEachLoop;

public class ForEachLoopPractice {
    public static void main(String[] args) {

        String[] words={ "java programing","Cydeo School","wooden spoon","Early birds","Angry birds"};

        for (String each:words ) {
            System.out.println(each.charAt(0)+""+each.charAt(words.length-1));



        }

    }
}
