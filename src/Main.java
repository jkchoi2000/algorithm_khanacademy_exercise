import mine.jkchoi.algorithm.*;
import mine.jkchoi.algorithm.sort.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        final int[] primes = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        System.out.println(BinarySearcher.search(primes, 67));

        //삽입 정렬
        System.out.println("삽입 정렬");
        final int[] insertionSortArray = new int[]{5, 6, 1, 2, 4, 3};
        System.out.println(Arrays.toString(insertionSortArray) + " => " + Arrays.toString(InsertionSort.sort(insertionSortArray)));

        //합병 (머지, 병합) 정렬
        System.out.println("병합 정렬");
        final int[] mergeSortArray = new int[]{5, 2, 4, 7, 6, 1, 3, 8};
        System.out.println(Arrays.toString(mergeSortArray) + " => " + Arrays.toString(MergeSort.sort(mergeSortArray)));

        //버블 정렬
        System.out.println("버블 정렬");
        final int[] bubbleSortArray = new int[]{5, 2, 4, 7, 6, 1, 3, 8};
        System.out.println(Arrays.toString(bubbleSortArray) + " => " + Arrays.toString(MergeSort.sort(bubbleSortArray)));

        //선택 정렬
        System.out.println("선택 정렬");
        final int[] selectionSortArray = new int[]{5, 2, 4, 7, 6, 1, 3, 8};
        System.out.println(Arrays.toString(selectionSortArray) + " => " + Arrays.toString(SelectionSort.sort(selectionSortArray)));

        //퀵 정렬
        System.out.println("퀵 정렬");
        final int[] quickSortArray = new int[]{5, 2, 4, 7, 6, 1, 3, 8, 9, 12, 22, 11, 3, 4, 11, 25, 2};
        System.out.println(Arrays.toString(quickSortArray) + " => " + Arrays.toString(QuickSort.sort(quickSortArray)));

        //계수 정렬
        System.out.println("계수 정렬");
        final int[] countingSortArray = new int[]{5, 2, 4, 7, 6, 1, 3, 8, 7, 4, 8};
        System.out.println(Arrays.toString(countingSortArray) + " => " + Arrays.toString(CountingSort.sort(countingSortArray)));

    }
}

