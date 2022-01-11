package day37_Inheritance.Phone;

public class iphone extends Phone {

    public iphone(String brand, String model,
                  String size, double price, String color) {
        super("Apple", model, size, price, color);
    }

    public void faceTime(long phoneNumber){
        System.out.println(phoneNumber+" is facetiming");
    }
    public void faceTime(String email){
        System.out.println(email+ " is facetiming");
    }

}


/*
1.2 Create a sub class of Phone named IPhone:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					faceTime(long phoneNumber)
					faceTime(String email)
					toString()
 */

