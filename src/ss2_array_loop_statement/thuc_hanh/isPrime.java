package ss2_array_loop_statement.thuc_hanh;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = Integer.parseInt(sc.nextLine());
        boolean flag = true;
        if(num<2){
            flag = false;
        }else {
                for(int i = 2;i<=Math.sqrt(num);i++){
                    if(num%i==0){
                        flag = false;
                        break;
                    }
                }
            }

        if(flag){
            System.out.println(num +" is a Prime Number");
        }else {
            System.out.println(num +" is NOT a Prime Number");

        }
        }
    }

