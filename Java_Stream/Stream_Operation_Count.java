package Java_Stream;

import java.util.stream.Stream;

public class Stream_Operation_Count {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        long primeNumberCount = Stream
                .iterate(1, n -> n + 1)
                .limit(100)
                .filter(Stream_Operation_Count::isPrime) /// .filter(n->isPrime(n))
                .count();

        System.out.println(primeNumberCount);
    }
}
