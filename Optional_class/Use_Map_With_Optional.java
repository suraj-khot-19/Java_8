package Optional_class;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Use_Map_With_Optional {
    private static Optional<List<Integer>> myList() {
        return Optional.ofNullable(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }

    public static void main(String[] args) {
        Optional<List<Integer>> list = myList();

        Optional<Integer> map = list.
                map(x -> x.stream().reduce(0, Integer::sum)
                );

        System.out.println(map.orElse(0));
    }

}
