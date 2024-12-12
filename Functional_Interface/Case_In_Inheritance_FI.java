package Functional_Interface;

@FunctionalInterface
interface Z {
    void getData();
}


@FunctionalInterface
interface MyInt extends Z {
    // void getNewData();
    /// Multiple non-overriding abstract methods found in interface Functional_Interface. MyInt

    //default method
    default void getDefaultData(){
        System.out.println("It is default method present in a y interface");
    }
}

@FunctionalInterface
interface MyInt2 extends MyInt{
    @Override
    void getData();
}

public class Case_In_Inheritance_FI {
    public static void main(String[] args) {
        MyInt ref=()->{
            System.out.println("Returning data with multilevel inheritance");
        };

        ref.getData();

        ref.getDefaultData(); //from y interface
    }
}
