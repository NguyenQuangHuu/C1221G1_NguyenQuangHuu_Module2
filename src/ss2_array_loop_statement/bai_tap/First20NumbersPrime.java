package ss2_array_loop_statement.bai_tap;

import java.util.Scanner;

public class First20NumbersPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố cần In ra");
        int numbers = Integer.parseInt(sc.nextLine());
        int count = 0;
        int so = 2;
        while(count<numbers){
            boolean flag = true;
            for(int i = 2; i <= Math.sqrt(so) ;i++){
                if(so%i==0){
                    flag= false;
                }
            }
            if(flag){
                System.out.println(so);
                count++;
            }
            so++;
        }
    }
}
