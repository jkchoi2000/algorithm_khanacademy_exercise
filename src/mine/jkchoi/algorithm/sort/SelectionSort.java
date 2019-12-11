package mine.jkchoi.algorithm.sort;

public class SelectionSort {
    public static int[] sort(int[] array) {
        if (array == null || array.length == 0) {
            return array;
        }

        int length = array.length;
        int tmp, index;

        for(int i = 0; i < length - 1; i++) {
            int min = array[i];
            index = -1;

            for(int j = i + 1; j < length; j++) {
                if(min > array[j]) {
                    index = j;
                    min = array[j];
                }
            }

            if(index > 0) {
                tmp = array[i];
                array[i] = min;
                array[index] = tmp;
            }
        }

        return array;

    }
}
