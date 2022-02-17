package ss2_array_loop_statement.thuc_hanh;

import java.util.Scanner;

public class ConvertTemperature {
    private static double celsiusToFahrenheit(double celsius){
        return (9.0 / 5) * celsius + 32;
    }
    private static double fahrenheitToCelsius(double fahrenheit){
        return (5.0 / 9) * (fahrenheit - 32);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choose;
        do{
            System.out.println("Menu: ");
            System.out.println("1.C => F");
            System.out.println("2.F => C");
            System.out.println("0.Exit");
            choose=Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    System.out.println("Nhập độ C");
                    double celsius = Double.parseDouble(sc.nextLine());
                    System.out.println(celsiusToFahrenheit(celsius));
                    ;break;
                case 2:
                    System.out.println("Nhập độ F");
                    double fahrenheit = Double.parseDouble(sc.nextLine());
                    System.out.println(fahrenheitToCelsius(fahrenheit));
                    ;break;
            }
        }while(choose!=0);

    }



}
