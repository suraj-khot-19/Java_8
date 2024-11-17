package Java_Stream;

import java.util.Arrays;
import java.util.List;

public class Stream_Operation_skip {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> odd=list.stream().filter(n->n%2!=0).toList();

        List<Integer> firstFiveWithSkippingFirst=odd.stream().limit(5).skip(1).toList();

        System.out.println(firstFiveWithSkippingFirst);

    }
}
