package Java_Stream;
import java.util.stream.Stream;

public class Stream_Operation_reduce {
    public static void main(String[] args) {
        int sumOf100= Stream.iterate(0,n->n+1)
                .limit(101)
                .reduce(0,Integer::sum);
        System.out.println(sumOf100);
    }
}
