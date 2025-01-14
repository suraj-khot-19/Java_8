/*
Streams in Java 8
Streams in Java 8 provide a functional approach to process collections of data. It represents a
sequence of elements and supports various operations that can be performed on these elements to produce a result.

Key Characteristics of Streams:
1. Functional: Operations are expressed declaratively using lambda expressions.

2. Non-Storage: Streams do not store elements. They work with data provided by a source (like a collection).

3. Lazy Execution: Intermediate operations are executed only when a terminal operation is invoked.

4. Immutable: Processing with streams does not modify the source; a new stream is returned.

5. Parallelism: Supports parallel processing for improved performance using parallel Stream.

Advantages of Streams:
Concise Code: Streams make complex data manipulation more readable and maintainable.
Parallel Processing: Simplifies multithreaded processing with minimal effort.
Improved Productivity: Functional-style code is easier to debug and test.
Memory Efficiency: Processes elements on demand (lazy evaluation).
 */
package Java_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Create_Stream {
    public static void main(String[] args) {
        //1. list to stream
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Stream<Integer> listToStream=list.stream();

        //2. array to stream
        Integer[] arr={1,2,3,4,5,6,7,8,9,10};
        Stream<Integer> arrayToStream=Arrays.stream(arr);

        //3. custom stream
        Stream<String> customStream1=Stream.of("suraj","khot");

        //4. with iterate though integers
        Stream<Integer> customStream2=Stream.iterate(0,n->n+1).limit(200);

        //5 with generating the integers
        Stream<Integer> customStream3=Stream.generate(()-> (int) (Math.random()*100)).limit(5);
    }
}
