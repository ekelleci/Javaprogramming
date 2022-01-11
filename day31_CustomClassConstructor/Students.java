package day31_CustomClassConstructor;

public class Students {
    public String name;
    public int age;
    public char gender;
    public char grade;
    public int id;

    public Students(String name, int age, char gender, char grade, int id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.grade = grade;
        this.id = id;
    }

    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                ", id=" + id +
                '}';
    }
}
