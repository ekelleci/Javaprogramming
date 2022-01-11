package day34_GarbageCollaction_AccessModifiers;

public class AccessModifiers {

    // public modifier
    public static int publicData=100;

    //default access modifier;
    static int defaultData=100;

    class  num{} ;

    // private access modifier
    private static int privateData=100;

    //Public method
    public static void method1(){
        System.out.println("Public");
    }

    //default method
    static void method2(){
        System.out.println("default");
    }
    //private method
    private static void method3(){
        System.out.println("Private");
    }



}
