package Functional_Interface.note;

@FunctionalInterface
interface FunctionalInterfaces{
    void getName(); /// only one abstract method

    static void myStaticMeth(){
        System.out.println("My type is static");
    };

    default void myDefaultMeth(){
        System.out.println("My type is default");
    }
}
public class Functional_Interface_With_Default_Static {
}
