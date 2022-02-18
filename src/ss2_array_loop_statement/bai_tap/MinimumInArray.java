package ss2_array_loop_statement.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử: ");
        int size = -1;
        while(size>10 || size < 0){
            size = Integer.parseInt(sc.nextLine());
            if(size > 10 || size <0){
                System.out.println("Nhập số nguyên dương và bé hơn 10");
            }
        }
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập giá trị phần tử mảng ở vị trí "+i);
            array[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println(Arrays.toString(array));
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if(min>array[i]){
                min = array[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất ở trong mảng là :"+min);
    }
}
