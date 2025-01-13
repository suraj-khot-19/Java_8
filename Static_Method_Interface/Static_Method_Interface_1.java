package Static_Method_Interface;


interface  A{
    static void sayHello(){
        System.out.println("Hello says A!");
    }
}
public class Static_Method_Interface_1 implements A {
    public static void main(String[] args) {
        Static_Method_Interface_1 obj=new Static_Method_Interface_1();

        //obj.sayHello(); //!error
        //Static_Method_Interface_1.sayHello(); //error

        A.sayHello(); //we can call static method inside an interface with their name only
    }
}
