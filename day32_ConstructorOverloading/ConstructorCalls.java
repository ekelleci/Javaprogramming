package day32_ConstructorOverloading;

public class ConstructorCalls {


    public ConstructorCalls(){
        System.out.println(" Defalt constructor");
    }

    public ConstructorCalls(int a){
        this();
        System.out.println(" constructor with int argument");
    }
    public ConstructorCalls(String str){
        this(10); //Default Constructor ,  Constructor with int argument
        System.out.println("Constructor with String argument");
    }


    public static void main(String[] args) {

        ConstructorCalls obj1 = new ConstructorCalls();

        System.out.println("----------------------------");

        ConstructorCalls obj2 = new ConstructorCalls(10);

        System.out.println("----------------------------");

        ConstructorCalls obj3 = new ConstructorCalls("Java");

    }
    }
