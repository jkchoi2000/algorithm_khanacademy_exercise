package mine.jkchoi.algorithm.sort;

public class QuickSort {
    public static int[] sort(int[] array) {
        if (array == null || array.length == 0) {
            return array;
        }

        sort(array, 0, array.length - 1);

        return array;
    }

    private static void sort(int[] array, int low, int high) {
        if (low >= high) {
            return;
        }

        int mid = separate(array, low, high);

        sort(array, low, mid - 1);
        sort(array, mid, high);
    }

    private static int separate(int[] array, int low, int high) {
        int pivot = array[(low + high) / 2];

        while (low <= high) {
            while (array[low] < pivot) {
                low++;
            }

            while (array[high] > pivot) {
                high--;
            }

            if (low <= high) {
                int tmp = array[low];
                array[low] = array[high];
                array[high] = tmp;

                low++;
                high--;
            }
        }

        return low;
    }
}
