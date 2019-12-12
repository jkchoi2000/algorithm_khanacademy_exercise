package mine.jkchoi.algorithm.recursion;

/*
 피보나치 수열의 index n의 값을 리턴
 피보나치 수열 : 1, 1, 2, 3, 5, 8, 13, 21, 34 ...
 */
public class FibonacciList {
    public static int[] list(int length) {
        int[] result = new int[length];

        func(length - 1, result);

        return result;
    }

    private static int func(int index, int[] result) {
        result[index] = (index < 2) ? 1 : func(index - 1, result) + func(index - 2, result);
        return result[index];
    }
}
