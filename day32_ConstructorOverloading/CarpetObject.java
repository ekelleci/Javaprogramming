package day32_ConstructorOverloading;

public class CarpetObject {
    public static void main(String[] args) {
        Carpet carpet1=new Carpet(3,5,8,true);
        Carpet carpet2=new Carpet(5,7,5,false);

        System.out.println("carpet1 = " + carpet1);
        System.out.println("carpet2 = " + carpet2);
    }
}
