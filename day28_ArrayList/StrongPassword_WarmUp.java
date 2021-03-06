package day28_ArrayList;

public class StrongPassword_WarmUp {
    public static void main(String[] args) {

        String password = "Cydeo1990@";

        boolean r1 = password.length() >= 8 && !password.contains(" ");
        boolean r2 = false; // has uppercase
        boolean r3 = false; // has lowercase
        boolean r4 = false; // has specialch
        boolean r5 = false; // has digit

        char[] arr = password.toCharArray();

        for (int each : arr) {

            if (Character.isUpperCase(each)) {
                r2 = true;
            } else if (Character.isLowerCase(each)) {
                r3 = true;

            } else if (Character.isDigit(each)) {
                r5 = true;
            } else {
                r4 = true;


            }

        }

        boolean isStronPassword= r1 && r2 && r3 && r4 && r5;

        System.out.println("isStronPassword = " + isStronPassword);
    }
}
  /*
    PasswordValidation:
    Write a program that can verify if a password is a strong password. Characteristics
    of strong passwords are:
                1. Password MUST be at least have 8 characters long, and
                should not contain space
                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lower case letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit
     */