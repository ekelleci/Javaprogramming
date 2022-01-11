package day34_GarbageCollaction_AccessModifiers;

public class StaticBlock {
    public static void main(String[] args) {

        System.out.println("Main method");
    }
    static {
        System.out.println("Static block 1");
    }
    static {
        System.out.println("Static block 2");
    }
    /*
    --static block execute first---
    Static block 1
    Static block 2
    Main method

     */
}
