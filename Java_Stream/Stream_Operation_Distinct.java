package Java_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_Operation_Distinct {
    public static void main(String[] args) {
        // in list need to print 1. even 2. squared  3. with removing duplicate and returning as a list

        List<Integer> list= Arrays.asList(1,2,3,4,1,2,8,9,70,5,44,70,44,8,2);

        List<Integer> answer=list.stream().filter(n->n%2==0).map(n->n*n).distinct().collect(Collectors.toList());

        //print
        answer.forEach(System.out::println);


    }
}
