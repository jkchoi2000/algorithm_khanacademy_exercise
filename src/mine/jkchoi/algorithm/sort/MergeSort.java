package mine.jkchoi.algorithm.sort;

public class MergeSort {
    public static int[] sort(int[] array) {
        if (array == null || array.length == 0) {
            return array;
        }

        sort(array, 0,  array.length);

        return array;
    }

    private static void sort(int[] array, int low, int high) {
        if(high - low < 2) {
            return;
        }

        int mid = (low + high) / 2;

        sort(array, low, mid);
        sort(array, mid, high);

        merge(array, low, mid, high);
    }

    private static void merge(int[] array, int low, int mid, int high) {
        int[] tmp = new int[high - low];
        int t = 0, l = low, h = mid;

        while (l < mid && h < high) {
            if(array[l] < array[h]) {
                tmp[t++] = array[l++];
            } else {
                tmp[t++] = array[h++];
            }
        }

        while(l < mid) {
            tmp[t++] = array[l++];
        }

        while(h < high) {
            tmp[t++] = array[h++];
        }

        for(int i = low; i < high; i++) {
            array[i] = tmp[i - low];
        }
    }
}
