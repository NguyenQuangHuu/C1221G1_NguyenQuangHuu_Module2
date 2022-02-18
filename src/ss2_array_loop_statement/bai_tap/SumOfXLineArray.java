package ss2_array_loop_statement.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfXLineArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử hàng , cột của ma trận vuông");
        int row = Integer.parseInt(sc.nextLine());

        int[][] array = new int[row][row];
        for (int i = 0 ; i< row;i++){
            for(int j = 0; j<row;j++){
                System.out.println("Nhập phần tử mảng ở vị trí hàng  "+ i +" cột "+j);
                array[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        for(int i = 0 ; i< array.length;i++){
            System.out.println(Arrays.toString(array[i]));

        }
        int count = 0;
        for(int i = 0;i<array.length;i++){
            count+=array[i][i];
        }
        System.out.println(count);
    }
}
