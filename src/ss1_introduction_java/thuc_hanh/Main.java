package ss1_introduction_java.thuc_hanh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your height");
        float height = sc.nextFloat();
        System.out.println("Enter your weight");
        float weight = sc.nextFloat();

        float bmi = height / (weight * weight);
        System.out.printf("Your BMI is : %f \n ",bmi);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");
        if(bmi < 18.5){
//            System.out.println("Underweight");
            System.out.printf("%-20s%s",bmi,"Underweight");
        }else if(bmi < 25){
//            System.out.println("Normal");
            System.out.printf("%-20s%s",bmi,"Normal");
        }else if(bmi< 30){
//            System.out.println("Overweight");
            System.out.printf("%-20s%s",bmi,"Overweight");

        }else {
//            System.out.println("Obese");
            System.out.printf("%-20s%s",bmi,"Obese");
        }
    }
}
