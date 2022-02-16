package ss1_introduction_java.thuc_hanh;

import java.util.Scanner;

public class OperatorExpression {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Width: ");
        width = sc.nextFloat();
        System.out.println("Enter Height: ");
        height = sc.nextFloat();

        float area = width * height;
        System.out.println("Area is: "+area);
    }
}
