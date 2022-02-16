package ss1_introduction_java.thuc_hanh;

import java.util.Scanner;

public class PTBacNhat {
    public static void main(String[] args) {
        System.out.println("Linear Equal Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("a :");
        int a = sc.nextInt();
        System.out.println("b :");
        int b = sc.nextInt();
        System.out.println("c :");
        int c = sc.nextInt();

        if(a!=0){
            float answer = (c-b)/a;
            System.out.printf("Equation pass with x = %f\n",answer);
        } else {
            if(b==c){
                System.out.println("The solution is all of x");
            }else{
                System.out.println("No Solution!");
            }
        }
    }
}
