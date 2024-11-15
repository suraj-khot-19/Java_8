package Java_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_Operation_Sorted_With_Function {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,5,77,-66,0,-77,-99,55);

        //not ascending we want descending
        List<Integer> descendingOrder= list.stream().sorted((n1,n2)->n2-n1).collect(Collectors.toList());

        System.out.println(descendingOrder);

        List<Character> characters=Arrays.asList('a','b','z','m','n','c');

        //sorting in reversed order of abcd

        List<Character> reversedOrder=characters.stream().sorted((c1,c2)->c2.compareTo(c1)).collect(Collectors.toList());

        System.out.println(reversedOrder);
    }
}
