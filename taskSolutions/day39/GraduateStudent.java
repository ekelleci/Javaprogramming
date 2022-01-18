package taskSolutions.day39;

public class GraduateStudent extends Student {

    public GraduateStudent(String name, int age, char gender, int studentId, String fieldOfStudy, String schoolName, char grade) {
        super(name, age, gender, studentId, fieldOfStudy, schoolName, grade);
    }

    @Override
    public void study() {
        System.out.println("Congratulations" + getName() + " you successfuly finished the program");
    }
}

/*
1. GraduateStudent:

						Override the study method

						add any additional fields and methods if necessary
 */