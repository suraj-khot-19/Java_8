/*
stream(): Executes sequentially in a single thread.
parallelStream(): Executes in parallel using multiple threads from the Fork/Join Framework.
Performance

stream(): Best suited for small datasets or tasks with minimal computational overhead.
parallelStream(): Ideal for large datasets or CPU-intensive operations where parallelism improves efficiency.
Thread Management

stream(): Operates in a single thread.
parallelStream(): Divides tasks among multiple threads to execute simultaneously.
 */

package Java_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Parallel_Stream {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,0);

        //parallel stream is more fast for large dataset than simple stream all other things
        //like methods and implementation is same
        Stream<Integer> stream = list.parallelStream();
    }
}
