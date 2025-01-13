package Method_Reference;

import java.util.Arrays;
import java.util.List;

public class Method_reference_2 {
    public static void main(String[] args) {
        List<String> name= Arrays.asList("suraj","sohan","adaya");

        name.forEach(System.out::println); //  :: represents method reference
    }
}
