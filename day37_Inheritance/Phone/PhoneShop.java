package day37_Inheritance.Phone;

public class PhoneShop {
    public static void main(String[] args) {
        iphone phone1=new iphone("Apple","iphone12","plus",749,"white");
        samsung phone2=new samsung("samsung","note5","elite",650,"gray");
        nokia phone3=new nokia("nokia","3300","small",100,"blue");

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
        System.out.println("-------------------------");

        phone1.call(911);
        phone2.freeze();
        phone3.selfDefense();
    }
}
