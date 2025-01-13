package LambdaExpression;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort_List {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(45,66,3,22,90,68);

        Collections.sort(list,(a,b)->a.compareTo(b));
        System.out.println(list);

        Collections.sort(list,(a,b)->b.compareTo(a));
        System.out.println(list);
    }
}
