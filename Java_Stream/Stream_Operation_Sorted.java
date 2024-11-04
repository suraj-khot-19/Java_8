package Java_Stream;
import java.util.Arrays;
import java.util.stream.Stream;

public class Stream_Operation_Sorted {
    public static void main(String[] args) {
        // in array sort an array with the help of stream and only even

        Integer[] arr={4,6,3,8,7,22,-90,-45,0};

        //stream of array
        Stream<Integer> stream= Arrays.stream(arr);

        Integer[] answer=stream.filter(n->n%2==0).sorted().toArray(Integer[]::new);

        for (Integer n : answer){
            System.out.println(n);
        }
    }
}
