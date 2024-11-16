package Java_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_Operation_limit {
    public static void main(String[] args) {
        // sort in reversed order and print only first two Strings

        List<String> list= Arrays.asList("adarsh","suraj","sohan","shubham","chetan");

        List<String> reversedOrder=list.stream().sorted((s1,s2)->s2.compareTo(s1)).limit(2).collect(Collectors.toList());

        System.out.println(reversedOrder);
    }
}
