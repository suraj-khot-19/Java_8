//// Example 1: Using lambda for iterating over a list

package LambdaExpression;
import java.util.Arrays;
import java.util.List;

public class Iterate_List {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 4, 3, 2, 25, 7);
        list.forEach(item-> System.out.println(item));
    }
}
