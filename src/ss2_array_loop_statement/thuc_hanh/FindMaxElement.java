package ss2_array_loop_statement.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        do{
            size = Integer.parseInt(sc.nextLine());
            if(size>20){
                System.out.println("Can not exceed");
            }
        }while(size>20);

        int[] array = new int[size];
        int count = 0;
        while(count<size){
            System.out.println("Nhập phần tử tại vị trí index = "+count);
            array[count] = Integer.parseInt(sc.nextLine());
            count++;
        }
        int max = array[0];
        for(int i =1;i<array.length;i++){
            if(max<array[i]){
                max = array[i];
            }
        }
        System.out.println("Số lớn nhất trong mảng :"+ Arrays.toString(array)+" là : "+max);
    }
}
