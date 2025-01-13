package Default_Method_Interface;

interface parent{
    default void sayHello(){          // default means it having a body
        System.out.println("Interface saying hello!");
    }
}
class child implements parent{

}
public class Default_method_1 {
    public static void main(String[] args) {
        child obj=new child();
        obj.sayHello();
    }
}
