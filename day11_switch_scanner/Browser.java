package day11_switch_scanner;

public class Browser {
    public static void main(String[] args) {

        String browserName= " chrome";

        String result = " "; // temproray variable.

        boolean validBrowser = browserName == " chrome" || browserName == " firefox" || browserName ==" opera"
                               || browserName==" safari" || browserName == " edge";
        // pre condition for nestedIf

        if( validBrowser)  {
            // there are 5 option

            if  ( browserName == " chrome")

                result = " Chrome browser is valid";

            }else if( browserName == " firefox" ) {

                result = " FireFox browser is valid";

            } else  if ( browserName == " opera") {

                result = " Opera browser is valid";
            }else if ( browserName == " safari"){

                result = " Safari browser is valid";


        } else {

            result = " Invalid Browser Name";
        }
        System.out.println( result);


        /*
        1. Create a class called Browser. Write a program that can display the name of selected browser
        1. declare a String variable named browserName
        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge.
        3. if the browser name does not match with the valid browser names, out put should be: Invalid Browser Name

        Ex:
            String browser = "chrome";

        Output:
            Chrome Browser is selected

        Note: MUST use nested if
         */

    }
}
