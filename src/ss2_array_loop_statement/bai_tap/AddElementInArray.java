package ss2_array_loop_statement.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        do{
            System.out.println("");
            size = Integer.parseInt(sc.nextLine());
            if(size<0||size>10){
                System.out.println("Số lượng phần tử mảng phải dương và giới hạn là 10 số");
            }
        }while(size<0||size>10);

        int[] array = new int[size+1];
        int i = 0;
        while(i<array.length-1){
            System.out.println("Nhập phần tử tại vị trí "+i);
            array[i] = Integer.parseInt(sc.nextLine());
            i++;
        }
        System.out.println(Arrays.toString(array));


        System.out.println("Nhập vị trí muốn thêm vào");
        int index = Integer.parseInt(sc.nextLine());
        if(index >= array.length || index < 0){
            System.out.println("Không tồn tại vị trí này trong mảng, không thể chèn");
        }else{
            for(int k = array.length-1;k>index;k--){
                array[k] = array[k-1];
            }
            System.out.println("Nhập phần tử muốn thêm vào");
            int element = Integer.parseInt(sc.nextLine());
            array[index] = element;
        }


        System.out.println(Arrays.toString(array));

    }
}
