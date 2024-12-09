package Optional_class;

import java.util.Optional;

public class Optional_Operation_Without_Using_orElse {
    private static Optional<String> getName(){
        return Optional.empty();
    }

    public static void main(String[] args) {
        Optional<String> name=getName();

        /// we need oto add conditional operator
        String nameToBeUsed= name.isPresent() ? name.get() : "NA";

        System.out.println(nameToBeUsed);
    }
}
