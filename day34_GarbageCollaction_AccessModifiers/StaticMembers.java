package day34_GarbageCollaction_AccessModifiers;

public class StaticMembers {
    int a;

    class class1{

    }
     // variables can be static
    public static int num = 100;

    // Methods can be static
    public static void method(){
    }
    static{
    }
}



    // Main class cannot be static only inner class can be static
class A { // outer class
    static class B { // inner class
        public static void method1(){
        }
    }
}
class C{
    public static void main(String[] args) {
        A.B.method1();
    }
}
class X{
}
class Y{
}
class Z{
    static class Q{
    }
}
