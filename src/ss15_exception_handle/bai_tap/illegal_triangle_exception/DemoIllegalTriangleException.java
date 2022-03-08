package ss15_exception_handle.bai_tap.illegal_triangle_exception;

import java.util.Scanner;

public class DemoIllegalTriangleException {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.println("Nhập cạnh a");
//        int sideA = Integer.parseInt(sc.nextLine());
//        System.out.println("Nhập cạnh b");
//        int sideB = Integer.parseInt(sc.nextLine());
//        System.out.println("Nhập cạnh c");
//        int sideC = Integer.parseInt(sc.nextLine());
        int[] triangle = new int[3];
        for(int i = 0; i <triangle.length;i++){

            System.out.println("Nhập cạnh "+i);
            boolean flag = false;
            do{
                flag = false;
                try{
                    triangle[i] = Integer.parseInt(sc.nextLine());

                    flag=true;

                }catch (NumberFormatException e){
                    System.out.println("Lỗi nhập chữ, vui lòng nhập số");
                }
            }while (flag);

        }

        int sideA = triangle[0];
        int sideB = triangle[1];
        int sideC = triangle[2];



        if(sideA>0 && sideB >0 && sideC>0){
            try {
                triangleCheck(sideA, sideB, sideC);
                System.out.println("ĐỘ DÀI 3 cạnh tam giác là :" + sideA + ", " + sideB + ", " + sideC);
            } catch (IllegalTriangleException e) {
                System.out.println("Độ dài 2 cạnh ngẫu nhiên phải lớn hơn độ dài cạnh còn lại. Đây không phải là hình tam giác");
            }
        }else{
            try {
                triangleInput(sideA, sideB, sideC);
            } catch (IllegalTriangleException e) {
                System.out.println("Độ dài cạnh của tam giác không được là số âm");
            }
        }

    }

    public static void triangleInput(int sideA, int sideB, int sideC) throws IllegalTriangleException {
        if (sideA < 0 || sideB < 0 || sideC < 0) {
            throw new IllegalTriangleException();
        }
    }

    public static void triangleCheck(int sideA, int sideB, int sideC) throws IllegalTriangleException {
        if (sideA + sideB < sideC || sideB + sideC < sideA || sideA + sideC < sideB) {
            throw new IllegalTriangleException();
        }
    }


}
