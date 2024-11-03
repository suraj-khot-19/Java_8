package Java_Stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_Operation_filter {
    public static void main(String[] args) {
        //list
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //stream of list
        Stream<Integer> stream=list.stream();

        //using filters function for filtering integers
        Stream<Integer> even = stream.filter(n -> n % 2 == 0);

        //printing with the help of for each
        even.forEach(System.out::println);
    }
}
