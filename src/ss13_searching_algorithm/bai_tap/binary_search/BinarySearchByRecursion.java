package ss13_searching_algorithm.bai_tap.binary_search;

import java.util.Arrays;

public class BinarySearchByRecursion {
    public static void main(String[] args) {
        int[] array = {5,3,7,1,9,7,10,12};
        int result = binarySearchByRecursion(array,12);
        System.out.println(result);
    }

    public static int binarySearchByRecursion(int[] array,int number){
        for(int i = 0 ; i<array.length;i++){

            for(int j = i+1;j<array.length-1;j++){
                if(array[i]>array[j]){
                    int temp = array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }

        }

        System.out.println(Arrays.toString(array));
        int left = 0;
        int right = array.length;

            while(left<right){
                int middle = (left+right)/2;
                if(array[middle]==number){
                    return middle;
                }else if(number>array[middle]){
                    left = middle +1;
                }else {
                    right = middle -1;
                }
            }

        return -1;
    }
}
