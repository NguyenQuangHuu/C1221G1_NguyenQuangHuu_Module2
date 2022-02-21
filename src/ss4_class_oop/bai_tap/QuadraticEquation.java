package ss4_class_oop.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }


    public double getDiscriminant(){
        return Math.pow(this.getB(),2) - 4*this.getA()*this.getC();
    }


    public double getRoot1(){
        return (-this.getB() + Math.sqrt(this.getDiscriminant()))/2*this.getA();
    }
    public double getRoot2(){
        return (-this.getB() - Math.sqrt(this.getDiscriminant()))/2*this.getA();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        double a = sc.nextDouble();
        System.out.println("Enter b");
        double b = sc.nextDouble();
        System.out.println("Enter c");
        double c = sc.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);

        if(quadraticEquation.getDiscriminant()>0){
            System.out.println("The equation has two root : "+quadraticEquation.getRoot1() +" and "+quadraticEquation.getRoot2());
        }else if(quadraticEquation.getDiscriminant()==0){
            System.out.println("The equation has only one root :"+quadraticEquation.getRoot1());
        }else{
            System.out.println("The equation has no real root");
        }
    }
}
