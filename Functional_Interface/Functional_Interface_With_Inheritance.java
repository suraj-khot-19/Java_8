package Functional_Interface;
@FunctionalInterface
interface X{
    void getData();
}

@FunctionalInterface
interface Y extends X{

}

public class Functional_Interface_With_Inheritance {
    public static void main(String[] args) {
        Y ref=()->{
            System.out.println("Data");
        };

        ref.getData();
    }
}
