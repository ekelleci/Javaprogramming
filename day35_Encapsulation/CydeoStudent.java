package day35_Encapsulation;

public class CydeoStudent {
// variables
    public String name;
    public char gender;
    public int age;
    public int batchNumber;
    public int groupNumber;
    public static String schoolName;
    public String fieldOfStudy;
    public static String programmingLanguage;
    public static String secretCode;
// generate constructor
    public CydeoStudent(String name, char gender, int age, int batchNumber, int groupNumber, String fieldOfStudy) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldOfStudy = fieldOfStudy;
    }

// create static blocks

    static {schoolName = "CYDEO";
        programmingLanguage = "JAVA";
        secretCode = "Wooden Spoon"; }


 //Methods
 public void attendClas(){
     System.out.println(name+"is attending class");
 }
 public void study(){
     System.out.println(name+" is studying");
 }
 public static void  printSecretCode(){
     System.out.println("secret code is"+ secretCode);
 }
public static void printSchoolName(){
    System.out.println("School name is "+schoolName);
}

// to string


    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", school='" + schoolName + '\'' +
                ", programming language='" + programmingLanguage + '\'' +
                '}';
    }
}

/*
 2. create a class named CydeoStudent
            Variables:
                name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage, secretCode

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            methods:
                printSchoolName();
                printSecretCode();
                attendClass():
                study()
                toString()
 */