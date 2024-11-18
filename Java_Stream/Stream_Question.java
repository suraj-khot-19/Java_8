package Java_Stream;

import java.util.List;
import java.util.stream.Stream;

public class Stream_Question {
    public static void main(String[] args) {
        List<Integer> question = Stream
                .iterate(0, n -> n + 1)
                .limit(101)
                .skip(1)
                .filter(n -> n % 2 == 0)
                .sorted((n1, n2) -> n2 - n1)
                .toList();

        System.out.println(question);
    }
}
