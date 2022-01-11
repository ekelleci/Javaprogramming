package taskSolutions;

public class day24_RetunMethid_Task2 {

    public static void main(String[] args) {
       int num2=maxnum(new int[]{4, 2, 8, 3, 6});

        System.out.println(num2);
    }



    //2. create a method that can return the maximum number from an array of integers

    public static int maxnum(int []num){
        int result=0;
        int max=0;

        for (int i = 0; i <num.length ; i++) {

            if (num[i]>max){
                max=num[i];

                result=max;
            }

            }

        return result;

    }
}
