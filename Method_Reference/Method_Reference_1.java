package Method_Reference;

import java.util.Arrays;
import java.util.List;

public class Method_Reference_1 {
    public static void printing(int i){
        System.out.println(i);
    }

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7);

        list.forEach(Method_Reference_1::printing);
    }
}
