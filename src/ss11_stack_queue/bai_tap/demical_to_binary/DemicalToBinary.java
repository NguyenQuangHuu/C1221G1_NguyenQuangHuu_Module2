package ss11_stack_queue.bai_tap.demical_to_binary;

import java.util.Scanner;
import java.util.Stack;

public class DemicalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        System.out.println("Nhập số cần chuyển đổi");
        int num = Integer.parseInt(sc.nextLine());

        while(num != 0){
            stack.push(num%2);
            num = num / 2;
        }
        System.out.println(stack);
        String str = "";
        while(!stack.isEmpty()){
            str+=stack.pop();
        }
        System.out.println("Số thập phần sau chuyển đổi qua nhị phân là :"+str);
    }
}
