package taskSolutions.day39;

public class Person {
    /* Step 1
    1. Create a class named Person:
			Variables:
				name, age, gender
     */
    private String name;
    private int age;
    private char gender;

    /*Step 2
    Encapsulate all the fields


					Condition:
						1. name should not be set to null
						2. name should not be empty
						3. name should not contain any special character other than space
						4. age should not be set to negative
						5. gender must be valid

     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name==null){
            System.err.println("Invalid entry");
            System.exit(1);
        }
        if(name.isEmpty()||name.isBlank()){
            System.err.println("Invalid entry");
            System.exit(1);
        }
        for (int i = 0; i < name.length(); i++) {

            if (!Character.isLetter(name.charAt(i))){
                System.err.println("Invalid entry");
                System.exit(1);
            }
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if ( age<0){
            System.err.println("Invalid entry");
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(!(gender=='M'||gender=='F'||gender=='m'||gender=='f')){
            System.err.println("Invalid entry");
            System.exit(1);

        }
        this.gender = gender;
    }
    // Step 3 create methods
    public void eat(){
        System.out.println( name+ " is eating");
    }

    public void drink(){
        System.out.println(name+ " is drinking");
    }

    public void sleep(){
        System.out.println(name+ " is sleeping");
    }

    // Step 4 create constructor


    public Person(String name, int age, char gender) {
        // since we have conditions we change this. to setVar
        setAge(age);
        setGender(gender);
        setName(name);
    }


    // Step 5 toString


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}

/*
Student Task:
	1. Create a class named Person:
			Variables:
				name, age, gender

			Encapsulate all the fields

			Add a constructor that can set all the fields

					Condition:
						1. name should not be set to null
						2. name should not be empty
						3. name should not contain any special character other than space
						4. age should not be set to negative
						5. gender must be valid

			Methods:
				eat()
				drink()
				sleep()
				toString()

 */