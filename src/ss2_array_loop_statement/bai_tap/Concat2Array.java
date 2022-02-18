package ss2_array_loop_statement.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Concat2Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử của mảng A");
        int sizeA = Integer.parseInt(sc.nextLine());
        int[] arrayA = new int[sizeA];
        int iA = 0;
        while(iA < sizeA){
            System.out.println("Nhập phần tử ở vị trí :"+iA+" cho mảng A");
            arrayA[iA] = Integer.parseInt(sc.nextLine());
            iA++;
        }
        System.out.println("Nhập số lượng phần tử của mảng B");
        int sizeB = Integer.parseInt(sc.nextLine());
        int[] arrayB = new int[sizeB];
        int iB = 0;
        while(iB < sizeB){
            System.out.println("Nhập phần tử ở vị trí :"+iB+" cho mảng B");

            arrayB[iB] = Integer.parseInt(sc.nextLine());
            iB++;
        }
        System.out.println(Arrays.toString(arrayA)+" "+Arrays.toString(arrayB));

        int[] arrayC = new int[sizeA+sizeB];

        for(int i = 0 ; i<arrayA.length ;i++){
            arrayC[i] = arrayA[i];
        }
        System.out.println(Arrays.toString(arrayC));
        for(int i = sizeA  ;i<arrayC.length;i++){
            arrayC[i] = arrayB[i-sizeA];
        }

        System.out.println(Arrays.toString(arrayC));

    }
}
