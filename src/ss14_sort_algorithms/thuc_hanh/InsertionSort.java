package ss14_sort_algorithms.thuc_hanh;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {2,4,1,0,9,8,3,5,7,6};
        int pos,x;
        for(int i = 0 ; i<array.length;i++){
            x=array[i];
            pos=i;
            while (pos>0&& x < array[pos-1]){
                array[pos] = array[pos-1]; // đổi chỗ
                pos--;
            }
            array[pos] = x;
        }
        System.out.println(Arrays.toString(array));
    }
}
