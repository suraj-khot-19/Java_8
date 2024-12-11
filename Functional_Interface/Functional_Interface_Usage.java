package Functional_Interface;

@FunctionalInterface
interface MyFunctionalInterfaceUsage{
    void getName();

    static int getAge(){
        return 24;
    }

    default int getSalary(){
        return 24000;
    }
}

public class Functional_Interface_Usage {
    public static void main(String[] args) {
        MyFunctionalInterfaceUsage ref = () -> {
            System.out.println("Suraj");
        };

        ref.getName();

        MyFunctionalInterfaceUsage.getAge();

        int sal = ref.getSalary();
        System.out.println(sal);
    }
}
