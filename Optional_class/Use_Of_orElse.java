package Optional_class;

import java.util.Optional;

public class Use_Of_orElse {
    private static Optional<String> getName(){
        return Optional.empty();
    }

    public static void main(String[] args) {
        Optional<String> name=getName();

        String nameIfNUll=name.orElse("Not Available");

        System.out.println(nameIfNUll);
    }
}
