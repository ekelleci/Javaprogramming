package day37_Inheritance.Phone;



    public class samsung extends Phone {


        public samsung(String brand, String model, String size, double price, String color) {
            super("Samsung", model, size, price, color);
        }

        public void freeze(){
            System.out.println(brand+" "+model+ " is frozen");
        }

    }

/*
1.3 Create a sub class of Phone named Samsung:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					freeze()
					toString()
 */

