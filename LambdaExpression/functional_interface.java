//// Example 2: Using lambda with functional interfaces
package LambdaExpression;

interface MathOperation{
    int operation(int a,int b);
}
public class functional_interface {
    public static void main(String[] args) {
        MathOperation add=(a,b)-> a+b;
        MathOperation sub=(a,b)-> a-b;

        System.out.println(add.operation(1,2));
        System.out.println(sub.operation(1,2));
    }
}
