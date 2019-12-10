package mine.jkchoi.algorithm;

import java.util.Arrays;

public class InsertionSort {
    public static int[] sort(int[] array) {
        if (array == null || array.length == 0) {
            return array;
        }


        int length = array.length;
        int j;

        for(int i = 1; i < length; i++) {
            int val = array[i];

            for(j = (i - 1); j >= 0 && val < array[j]; j--) {
               array[j + 1] = array[j];
            }

            array[j + 1] = val;
        }

        /**
         * 정답
         */
//        int j, temp;
//        int length = array.length;
//
//        for (int i = 1; i < length; i++) {
//            temp = array[i]; // 새로운 숫자를 선택함
//            for (j = i - 1; j >= 0 && temp < array[j]; j--) { // 선택한 숫자를 이미 정렬된 숫자들과 비교하며 넣을 위치를 찾는 과정, 선택한 숫자가 정렬된 숫자보다 작으면
//                array[j + 1] = array[j]; // 한 칸씩 뒤로 밀어낸다
//            }
//            array[j + 1] = temp; // 마지막 빈 칸에 선택한 숫자를 넣어준다.
//            System.out.println(i + " / " + (j + 1) + " / " + Arrays.toString(array));
//
//        }

        return array;
    }
}
