package Default_Method_Interface;

interface A{
    default void sayHello(){
        System.out.println("Hello is saying by the interface");
    }
}

class myclass implements A{
    @Override
    public void sayHello() {
        System.out.println("Hello is saying by the class");
    }
}

public class Default_Method_2 {
    public static void main(String[] args) {
        //myclass obj=new myclass();
        A obj=new myclass();
        obj.sayHello();
    }
}
