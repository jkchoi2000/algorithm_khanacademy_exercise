import mine.jkchoi.algorithm.BinarySearcher;
import mine.jkchoi.algorithm.InsertionSort;
import mine.jkchoi.algorithm.MergeSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        final int[] primes = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        System.out.println(BinarySearcher.search(primes, 67));

        //삽입 정렬
        final int[] insertionSortArray = new int[]{5, 6, 1, 2, 4, 3};
        System.out.println(Arrays.toString(insertionSortArray) + " => " + Arrays.toString(InsertionSort.sort(insertionSortArray)));

        //합병 (머지, 병합) 정렬
        final int[] mergeSortArray = new int[]{5, 2, 4, 7, 6, 1, 3, 8};
        System.out.println(Arrays.toString(mergeSortArray) + " => " + Arrays.toString(MergeSort.sort(mergeSortArray)));

    }
}

