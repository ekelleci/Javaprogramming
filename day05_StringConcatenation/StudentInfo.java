package day05_StringConcatenation;

public class StudentInfo {

    public static void main(String[] args) {
        /*
        2. Create a class called StudentInfo, and declare variables for the followings:
                1. student name ( String )
                2. age          ( int )
                3. gender       (char )
                4. school name  ( String )
                5. phone number ( String ) (###)-###-###
                6. full time (boolean )
         */

        String student_name = "Emre";
        int                age = 32;
        char            gender = 'M';
        String      SchoolName = "Cydeo";
        String     phoneNumber = " (336)-500-4242";
        boolean     isFullTime = true;

        System.out.println("SchoolName = " + SchoolName);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("SchoolName = " + SchoolName);
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("isFullTime = " + isFullTime);



    }
}
