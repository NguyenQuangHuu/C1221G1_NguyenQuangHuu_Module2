package ss14_sort_algorithms.bai_tap;

import java.util.Arrays;

public class InsertionSortDescription {
    public static void main(String[] args) {
        int[] array = {3,0,2,4,-1,10,12,20,16};
        insertionSort(array);
    }

    public static void insertionSort(int[] list){

        int x;
        int temp;
        System.out.println("Mảng đầu vào: "+Arrays.toString(list));
        for(int i = 1 ; i<list.length;i++){
            x = list[i];
            temp = i;

            while(temp>0 && x < list[temp-1]){
                System.out.println("Vị trí hoán đổi lần lặp thứ "+i+" : "+list[temp]+" : "+list[temp-1]);
                list[temp] = list[temp-1];

                temp--;

            }
            list[temp] = x;
            System.out.println("Vị trí sau hoán đổi của lần lặp thứ "+i+":"+Arrays.toString(list));

        }
        System.out.println("Mảng sau khi sử dụng insertionSort: "+Arrays.toString(list));
        System.out.println(Arrays.toString(list));
    }
}
