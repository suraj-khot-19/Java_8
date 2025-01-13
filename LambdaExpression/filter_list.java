
//// Example 3: Using lambda for filtering a list
package LambdaExpression;

import java.util.Arrays;
import java.util.List;

public class filter_list {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(5,33,88,77,90);

        list.stream().filter(item -> item%2==0).forEach(i-> System.out.println(i));

    }
}
