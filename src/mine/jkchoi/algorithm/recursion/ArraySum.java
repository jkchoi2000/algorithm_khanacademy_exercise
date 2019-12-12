package mine.jkchoi.algorithm.recursion;

public class ArraySum {
    public static int sum(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        int index = array.length - 1;

        return recursiveSum(array, index);
    }

    private static int recursiveSum(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            return 0;
        }

        return array[index] + recursiveSum(array, index - 1);
    }
}
