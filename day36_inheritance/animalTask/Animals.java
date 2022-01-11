package day36_inheritance.animalTask;

public class Animals {

    public String name;
    public int age;
    public String color;
    public char gender;
    public String breed;
    public String size;


    public void setInfo(String name, String breed, char gender, int age, String size, String color) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.size = size;
        this.color = color;
    }

    public void eat(){
        System.out.println(name+ " is eating");

    }
    public void drink(){
        System.out.println(name+ " is drinking");
    }

    public void move(){
        System.out.println(name+ " is moving");
    }
    public void sleep(){
        System.out.println(name+ " is sleeping");
    }

    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
