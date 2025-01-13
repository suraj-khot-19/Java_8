package Functional_Reference;

import java.util.Arrays;
import java.util.List;

public class Function_Reference_java_8 {
    public static void printing(int i){
        System.out.println(i);
    }

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7);

        list.forEach(Function_Reference_java_8::printing);
    }
}
