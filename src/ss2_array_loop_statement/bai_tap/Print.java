package ss2_array_loop_statement.bai_tap;

import java.util.Scanner;

public class Print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choose = -1;
        do{
            System.out.println("\nChoose your menu: ");
            System.out.println("1. Print Rectangle ");
            System.out.println("2. Print the square triangle ");
            System.out.println("3. Print isosceles triangle ");
            System.out.println("4. Exit ");
            System.out.println("Your Choice : ");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1: rectangle();break;
                case 2: squareTriangle();break;
                case 3: triangle();break;
                default: choose = 0;
            }
        }while(choose != 0);

    }
    private static void rectangle(){
        for(int i = 0; i<4;i++){

            for(int j = 0; j<6;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    private static void triangle(){
        for(int i = 0; i<6;i++){

            for(int j = 0; j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    private static void squareTriangle(){
        for(int i = 0; i<6;i++){
//            for(int k = 0 ; k<i;k++){
//                System.out.print(" ");
//            }
            for(int j = i; j<6;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
