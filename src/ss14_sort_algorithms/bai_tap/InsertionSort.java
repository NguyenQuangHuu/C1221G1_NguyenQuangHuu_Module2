package ss14_sort_algorithms.bai_tap;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {3,0,2,4,-1,10,12,20,16};
        int x,temp;
        System.out.println("Mảng khởi tạo đầu vào: "+Arrays.toString(array));
        for(int i = 1 ; i<array.length;i++){
            x = array[i];
            temp = i;

            while(temp>0 && x < array[temp-1]){
                System.out.println("Vị trí hoán đổi lần lặp thứ "+i+" : "+array[temp]+" : "+array[temp-1]);
                array[temp] = array[temp-1];

                temp--;

            }
            array[temp] = x;
            System.out.println("Vị trí sau hoán đổi của lần lặp thứ "+i+":"+Arrays.toString(array));

        }
        System.out.println("Mảng sau khi sử dụng insertionSort: "+Arrays.toString(array));
    }
}
