package ss1_introduction_java.thuc_hanh;

import java.util.Scanner;

public class IsLeapYear {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        short year = sc.nextShort();
//        if(year % 4 == 0){
//            if(year%100==0){
//                if(year%400==0){
//                    System.out.printf("%d is a leap year",year);
//                }else{
//                    System.out.printf("%d is NOT a leap year",year);
//                }
//
//            }else{
//                System.out.printf("%d is a leap year",year);
//            }
//        }else{
//            System.out.printf("%d is NOT a leap year",year);
//        }
        boolean isLeapYear = false;
        boolean isDividedBy4 = year % 4 == 0;

        boolean isDividedBy100 = year % 100 == 0;

        boolean isDividedBy400 = year % 400 == 0;

        if (isDividedBy4) {
            if (isDividedBy100) {
                if (isDividedBy400) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }


        if(isLeapYear){
            System.out.printf("%d is a leap year",year);
        }else{
            System.out.printf("%d is NOT aleap year",year);

        }
    }
}
