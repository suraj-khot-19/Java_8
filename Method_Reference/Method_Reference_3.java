package Method_Reference;

import Java_Stream.Stream_Operation_Count;

import java.util.stream.Stream;

public class Method_Reference_3 {
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
                    .filter(Java_Stream.Stream_Operation_Count::isPrime) /// .filter(n->isPrime(n))  /// method reference
                    .count();

            System.out.println(primeNumberCount);
        }
}
