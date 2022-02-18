package ss2_array_loop_statement.bai_tap;

import java.util.Scanner;

public class CharInLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi cho trước");
        String str = sc.nextLine();
        System.out.println("Kí tự cần đếm khi phần tử xuất hiện trong mảng");

        char ch = sc.nextLine().charAt(0);

        int count = 0;
        for(int i =0;i<str.length();i++){
            if(str.charAt(i) == ch){
                count++;
            }
        }
        System.out.println(count);
    }
}
