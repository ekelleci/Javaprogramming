package replit_projects;

import java.util.Scanner;

public class StatementsHTTP {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter status");
        int status= scan.nextInt();

        String result=" ";

        switch (status){
            case 200:
                result="OK";
                break;
            case 201:
                result="Created";
                break;
            case 202:
                result="Accepted";
                break;
            case 301:
                result="Moved permanently";
                break;
            case 303:
                result="See Other";
                break;
            case 304:
                result="Not Modified";
                break;
            case 307:
                result="Temporary Redirect";
                break;
            case 400:
                result=" Bad Request";
                break;
            case 401:
                result=" Unauthorized";
                break;

            case 403:
                result=" Forbidden";
                break;

            case 404:
                result=" Not found";
                break;
            case 410:
                result=" gone";
                break;
            case 500:
                result="Internal Server Error";
                break;

            case 503:
                result="Service Unavailable";
                break;
            default:
                result= "invalid status code";




        }
        System.out.println(result);
        scan.close();
    }
}
