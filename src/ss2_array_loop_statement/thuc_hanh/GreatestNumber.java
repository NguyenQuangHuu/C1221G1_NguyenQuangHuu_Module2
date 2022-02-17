package ss2_array_loop_statement.thuc_hanh;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number A");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Enter number B");
        int b = Integer.parseInt(sc.nextLine());

        a = Math.abs(a);
        b = Math.abs(b);
        if(a!=0 || b!=0){
            System.out.println("No greatest common factor");
        }
        while(a!=b){
            if(a>b){
                a = a-b;
            }else{
                b = b-a;
            }
        }
        System.out.println("A greatest number is "+a);
    }
}
