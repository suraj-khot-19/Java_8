package Optional_class;

import java.util.Optional;

public class Optional_Class_Working {
    /// 1 case
    public static Optional<String> getName(){
        String name=null;
        return Optional.ofNullable(name);
    }

    /// 2 case
    public static Optional<String> sendName(){
        String name="Ram";
        return Optional.of(name);
    }

    public static void main(String[] args) {

        /// first sol
        if (getName().isPresent()){
            System.out.println(getName());
        }

        getName().ifPresent(System.out::println);

        /// 2 sol
        Optional<String> name=sendName();

        if (name.isPresent()){
            System.out.println("This will directly print optional class reference: "+name);
            System.out.println("With the help of get method on optional: "+name.get());
        }
    }
}
