/*
1.Functional Interface:

A functional interface has one abstract method and can be implemented using lambda expressions.
The annotation @FunctionalInterface (not used here but recommended) helps ensure that the interface remains functional by throwing an error if additional methods are added.

2.Lambda Expression:

Provides a shorthand way to implement functional interfaces.
Eliminates the need for creating anonymous inner classes
 */

package Functional_Interface_With_Lambada_Expression;

//interface X: This is a functional interface because it contains exactly one abstract method.
@FunctionalInterface
interface X {
    void functionalInterface();
}

public class Both_In_One_Example {
    public static void main(String[] args) {
      X x=()->{
          System.out.println("I am both functional interface and lambda expression");
      };

      x.functionalInterface();
    }

}
