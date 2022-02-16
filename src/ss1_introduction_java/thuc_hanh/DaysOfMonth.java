package ss1_introduction_java.thuc_hanh;

import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) {
        // write your code here
        System.out.println("Nhập tháng cần kiểm tra ngày trong năm");
        Scanner sc = new Scanner(System.in);
        byte month = sc.nextByte();
        String daysInMonth;
        switch (month){
            case 2:
//                System.out.println("Tháng "+month +" có 28 hoặc 29 ngày");
                daysInMonth = " 28 hoặc 29 ngày";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
//                System.out.println("Tháng "+month +" có 31 ngày");
                daysInMonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
//                System.out.println("Tháng "+month +" có 30 ngày");
                daysInMonth = "30";
                break;
            default:
                daysInMonth = "";
        }
        if(!daysInMonth.equals("")) System.out.printf("The month %d has %s day",month,daysInMonth);
        else System.out.println("Valid Input");
    }
}
