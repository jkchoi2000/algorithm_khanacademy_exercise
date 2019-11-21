package mine.jkchoi.algorithm;

public class BinarySearcher {
    public static int search(int[] primes, int searching) {
        if (primes == null || primes.length == 0) {
            return -1;
        }

        int min = 0;
        int max = primes.length - 1;
        int cur = 0;
        int result = -1;

        while (min < max) {
            cur = (min + max) / 2;
            int curVal = primes[cur];

            if (searching == curVal) {
                result = cur;
                break;
            } else if (searching > curVal) {
                min = cur + 1;
            } else {
                max = cur - 1;
            }
        }

        return result;
    }
}
