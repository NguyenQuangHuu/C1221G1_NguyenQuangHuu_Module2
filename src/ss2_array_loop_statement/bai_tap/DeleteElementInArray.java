package ss2_array_loop_statement.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementInArray {
    public static void main(String[] args) {
        int[] array = {10,4,4,8,6,4,2,5,2,7};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập phần tử cần xóa");

        int input = Integer.parseInt(sc.nextLine());
        for(int i =0; i<array.length;i++){
            if(array[i] == input){
                for(int j = i; j<array.length-1;j++){
                    array[j] = array[j+1];

                }

                i--;
                array[array.length-1] = 0;


            }

        }
        System.out.println(Arrays.toString(array));
    }
}
