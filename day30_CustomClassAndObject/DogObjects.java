package day30_CustomClassAndObject;
import  java.util.ArrayList;
public class DogObjects {
    public static void main(String[] args) {
        Dog dog1= new Dog();
        dog1.name="Lucy";
        dog1.breed="Husky";
        dog1.age=5;
        dog1.gender='F';
        dog1.size="Small";
        dog1.color="White";



        Dog dog2=new Dog();
        dog2.name="Ace";
        dog2.breed="Husky";
        dog2.age=5;
        dog2.gender='M';
        dog2.size="Large";
        dog2.color="White & Black";

        Dog dog3=new Dog();
        dog3.setInfo("jack","kangal",4, 'M',
                "Large","Black");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        dog1.eat();

        dog2.bark();

        Dog dog4=new Dog();
        Dog dog5=new Dog();

        dog4.setInfo("Karabas","Coban",6, 'M',"large","Yellow");
        dog5.setInfo("Minnos","wolf",8,'F',"small","brown");

        Dog[] dogs = {dog1, dog2, dog3, dog4, dog5};


        ArrayList<Dog> femaleDogs =new ArrayList<>();
        ArrayList<Dog> maleDogs =new ArrayList<>();

        for (Dog each:dogs) {

            if(each.gender=='F'){
                femaleDogs.add(each);
            }else {
                maleDogs.add(each);
            }

        }

        System.out.println(femaleDogs);






    }
}
