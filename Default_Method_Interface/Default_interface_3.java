package Default_Method_Interface;
interface x{
    default void sayHello(){
        System.out.println("Hello is saying by interface x");
    }
}
interface y{
    default void sayHello(){
        System.out.println("Hello is saying by interface y");
    }
}

class MyClass implements x, y {
    //Default_Method_Interface. MyClass inherits unrelated defaults for sayHello() from types Default_Method_Interface. x and Default_Method_Interface. y

    //Ambiguity due to same default method names
}
public class Default_interface_3 {
    public static void main(String[] args) {
        MyClass obj=new MyClass();
        obj.sayHello();
    }
}
