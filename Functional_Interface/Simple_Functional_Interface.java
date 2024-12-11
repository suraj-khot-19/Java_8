package Functional_Interface;

@FunctionalInterface
interface A{
    int getData();
}
public class Simple_Functional_Interface {
    public static void main(String[] args) {
        A ref=()->5;
        int x=ref.getData();
        System.out.println(x);
    }
}
