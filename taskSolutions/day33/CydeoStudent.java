package taskSolutions.day33;

public class CydeoStudent {
  //step 1 Attributes:
    public String name;
    public int age,id,batchNumber,groupNumber;
    public char gender,grade;

    public static String schoolName="Cydeo ";
    public static String programmingLanguage="java";

    //step 2 Add a constructor that can set All the fields (instances)
    public CydeoStudent(String name, int age, int id, int batchNumber, int groupNumber, char gender, char grade) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.gender = gender;
        this.grade = grade;
    }


    //step 3 Actions:
    public void  study(){
        System.out.println(name+" is studying");
    }

    public void attendClass(){
        System.out.println(name+" attended the class");
    }

    public static  void printSchoolName(){
        System.out.println(schoolName);
    }

    public static void printProgLanguage(){
        System.out.println(programmingLanguage);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", gender=" + gender +
                ", grade=" + grade +
                '}';
    }
}
