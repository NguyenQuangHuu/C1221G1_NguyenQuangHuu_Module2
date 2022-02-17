package ss2_array_loop_statement.thuc_hanh;

import java.util.Scanner;

public class InterestRate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter investment amount: ");
        float money = Float.parseFloat(sc.nextLine());

        System.out.println("Enter annual interest rate in percentage: ");
        float rate = Float.parseFloat(sc.nextLine());

        System.out.println("Enter number of months: ");
        int month = Integer.parseInt(sc.nextLine());

        float totalInterest = 0;
        for(int i = 0; i<month;i++){
            totalInterest+= money * (rate / 100)/12 * month;
        }
        System.out.println("Total of interest: "+ totalInterest);
    }
}
