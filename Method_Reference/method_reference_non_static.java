package Method_Reference;

import java.util.Arrays;
import java.util.List;

class A {
    void Print(int x) {
        System.out.println(x);
    }
}

public class method_reference_non_static {
    public static void main(String[] args) {
        A obj=new A();

        List<Integer> list= Arrays.asList(1,2,4,3,1,2);

        //list.forEach(A::Print); // Non-static method cannot be referenced from a static context

        list.forEach(obj::Print);
    }
}
