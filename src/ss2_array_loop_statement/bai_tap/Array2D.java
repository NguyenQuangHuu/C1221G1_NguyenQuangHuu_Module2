package ss2_array_loop_statement.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số Hàng của mảng: ");
        int row = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số Cột của mảng: ");
        int column = Integer.parseInt(sc.nextLine());
        int[][] array = new int[row][column];

        for(int i = 0; i<array.length;i++){
            for(int j = 0; j<array[i].length;j++){
                System.out.println("Nhập vị trí phần tử vị trí hàng: "+i+" và cột: "+j);
                array[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        int max = array[0][0];
        for(int i = 0; i<array.length;i++){
            for(int j = 0; j<array[i].length;j++){
                if(max<array[i][j]){
                    max = array[i][j];
                }
            }
        }

        System.out.println("Giá trị lớn nhất: "+max);


    }
}

