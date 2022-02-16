package ss1_introduction_java.bai_tap;

import java.util.Scanner;

public class MoneyExchange {
    public static void main(String[] args) {
        short vnd = 23000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền USD cần chuyển đổi");
        int usd = Integer.parseInt(sc.nextLine());
        int result = usd * vnd;
        System.out.println("Sau chuyển đổi : "+ result);
    }
}
