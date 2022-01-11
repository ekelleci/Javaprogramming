package day24_CustomMethod_Returns;

public class WarmUp {
    public static void main(String[] args) {
        initials("Emre","k   elleci");
        System.out.println("----------------");
        domain("ekelleci@scgreencharter.org");
        System.out.println("--------------");
        String [] emails={"josh@gmail.com","kelly@outlook.com","malex@yahoo.com"};
        for (String email : emails) {
            domain(email);
        }
        System.out.println("___________");
        nameOfMonth(6);
    }


       // 1. Create a method that can display the initials of the person
        // initials( String First name and last name

        public static  void initials(String firstname, String lastName){

            String initial=firstname.charAt(0)+"."+lastName.charAt(0);
            initial=initial.toUpperCase();
            System.out.println("Initial="+initial);


        }
        //2. Create a method that can display the domain of the email
        public  static void domain(String email){

        String domain=email.substring(email.lastIndexOf("@")+1,email.lastIndexOf("."));

        System.out.println(domain);

    }
    //3. Create a method that can display the name of the month based on the given number to the method
        public static void nameOfMonth(int number){
    String name="";
    if(number>=1 && number<=12){
        name=(number==1)?"jan":(number==2)?"Feb":(number==3)?"March":(number==4)?"April":(number==5)?"May":(number==6)?"June"
                :(number==7)?"July":(number==8)?"August":(number==9)?"Sep":(number==10)?"Oct":(number==11)?"Nov":"Dec";
        // havew 12 possibility

    }else{
        name="invalid";

    }
            System.out.println("Month name="+name);
        };
    //
















 /*2.

4. Create a method that can print the name of the day based on the given number to the method

5. Create a method that can print how many days a month has
         */

    }

