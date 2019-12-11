package mine.jkchoi.algorithm;

import java.util.Arrays;

public class CountingSort {
    public static int[] sort(int[] array) {
        if (array == null || array.length == 0) {
            return array;
        }

        int max = Arrays.stream(array).max().getAsInt();
        int[] countArr = new int[max + 1];

        int length = array.length;
        int[] resultArr = new int[length];

        for (int anArray : array) {
            countArr[anArray]++;
        }

        int sum = 0;
        for (int i = 0; i <= max; i++) {
            sum += countArr[i];
            countArr[i] = sum;
        }

        for (int i = length - 1; i >= 0; i--) {
            int val = array[i];
            int count = countArr[val]--;
            int index = count - 1;

            resultArr[index] = val;
        }

        return resultArr;
    }
}
