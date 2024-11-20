package Java_Stream;
import java.util.stream.Stream;

public class Stream_Operation_peek {
    public static void main(String[] args) {
       Stream<Integer> peek = Stream.iterate(0,n->n*n).limit(15).filter(n -> n % 2 == 0).peek(x-> System.out.println("after filter:"+x)).skip(3).peek(x-> System.out.println("After skipping:"+x));

    }
}
