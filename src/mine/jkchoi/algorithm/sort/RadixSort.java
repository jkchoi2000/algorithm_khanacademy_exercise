package mine.jkchoi.algorithm.sort;

import java.util.*;

public class RadixSort {
    public static int[] sort(int[] array) {
        if (array == null || array.length == 0) {
            return array;
        }

        final List<Queue<Integer>> buckets = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            buckets.add(new LinkedList<>());
        }

        int maxVal = Arrays.stream(array).max().getAsInt();
        int maxTens = (int) Math.log10((double) maxVal);
        int mul = 1;
        int arrayLen = array.length;

        for (int i = 0; i < maxTens; i++, mul *= 10) {
            for (int j = 0; j < arrayLen; j++) {
                int val = array[j];
                int bucketIndex = (val / mul) % 10;
                buckets.get(bucketIndex).offer(val);
            }

            int index = 0;
            for (int k = 0; k < 10; k++) {
                Queue<Integer> queue = buckets.get(k);
                if (!queue.isEmpty()) {
                    int queueLen = queue.size();
                    for (int m = 0; m < queueLen; m++) {
                        array[index++] = queue.poll();
                    }
                }
            }

            buckets.forEach(Collection::clear);
        }


        return array;
    }
}
