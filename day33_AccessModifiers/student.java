package day33_AccessModifiers;

public class student {
    public String name;
    public char gender;
    public int age;
    public int studentID;
    public char grade;


    public student (String name){
        this.name=name;
    }

    public student (String name,char gender){
        this(name);
        this.gender=gender;
    }

    public student (String name,char gender,int age){
        this(name,gender);
        this.age=age;
    }

    public student (String name,char gender,int age,int studentID){
        this(name,gender,age);
        this.studentID=studentID;
    }
    public student (String name,char gender,int age,int studentID,char grade){
        this(name,gender,age,studentID);
        this.grade=grade;
    }

    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", studentID=" + studentID +
                ", grade=" + grade +
                '}';
    }
}
