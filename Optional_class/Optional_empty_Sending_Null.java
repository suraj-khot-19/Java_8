package Optional_class;

import java.util.Optional;

public class Optional_empty_Sending_Null {
    public static Optional<String> sendName(){
        return Optional.empty(); // means it is always empty(way to create an Optional Class object)
    }
    public static void main(String[] args) {
        Optional<String> name=sendName();

        System.out.println(name);

        name.ifPresent(System.out::print);
    }
}
