package ss2_array_loop_statement.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        do{
            System.out.println("Nhập số lượng phần tử mảng: ");
            size=Integer.parseInt(sc.nextLine());
            if(size>20){
                System.out.println("Size does not exceed 20");
            }
        }while(size>20);

        int[] array = new int[size];
        for(int i = 0; i<size;i++){
            System.out.println("Nhập vị trí phần tử mảng ở vị trí index "+i);
            array[i] = Integer.parseInt(sc.nextLine());
        }
//      int i = 0;
//      while(i<array.length){
//           array[i] = Integer.parseInt(sc.nextLine());
//      }
        System.out.println("Array : "+Arrays.toString(array));
        for(int i = 0; i<array.length/2;i++){
            int temp = array[i];
            array[i] = array[array.length-1 - i];
            array[array.length-1 - i] = temp;
        }
        System.out.println("Array reverse : "+Arrays.toString(array));
    }
}
