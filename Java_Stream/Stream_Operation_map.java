package Java_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_Operation_map {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7);

        //stream of list
        Stream<Integer> stream=list.stream();

        //stream of the squared elements
        Stream<Integer> stream1 = stream.map(n -> n * n);

        //printing with the help of for each
        stream1.forEach(System.out::println);
    }
}
