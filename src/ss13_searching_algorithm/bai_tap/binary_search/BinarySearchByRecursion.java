package ss13_searching_algorithm.bai_tap.binary_search;

import java.util.Arrays;

public class BinarySearchByRecursion {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 10, 12};
        int length = array.length;
        int result = binarySearchByRecursion(array, 0, length, 12);
        System.out.println(result);
    }

    public static int binarySearchByRecursion(int[] array, int left, int right, int number) {
//        for (int i = 0; i < array.length; i++) {
//
//            for (int j = i + 1; j < array.length - 1; j++) {
//                if (array[i] > array[j]) {
//                    int temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
//                }
//            }
//
//        }
        if (right < left) {
            return -1;
        }

        int middle = (left + right )/ 2;
        if (array[middle] == number) {
            return middle;
        }
        if (number > array[middle]) {
            return binarySearchByRecursion(array, middle + 1, right, number);
        } else {
            return binarySearchByRecursion(array, left, middle - 1, number);
        }

    }


//        System.out.println(Arrays.toString(array));
//        int left = 0;
//        int right = array.length;
//
//            while(left<right){
//                int middle = (left+right)/2;
//                if(array[middle]==number){
//                    return middle;
//                }else if(number>array[middle]){
//                    left = middle +1;
//                }else {
//                    right = middle -1;
//                }
//            }

}

