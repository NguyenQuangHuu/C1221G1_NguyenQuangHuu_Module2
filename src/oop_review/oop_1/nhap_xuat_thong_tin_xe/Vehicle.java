package oop_review.oop_1.nhap_xuat_thong_tin_xe;

public class Vehicle {
    private String numberPlate;
    private int cubicCapacity;
    private double price;

    public Vehicle() {
    }

    public Vehicle(String numberPlate,int cubicCapacity, double price) {
        this.numberPlate = numberPlate;
        this.cubicCapacity = cubicCapacity;
        this.price = price;
    }

    public int getCubicCapacity() {
        return cubicCapacity;
    }

    public void setCubicCapacity(int cubicCapacity) {
        this.cubicCapacity = cubicCapacity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    @Override
    public String toString() {
        return "Phương tiện :{" +
                "Biển số xe: "+this.getNumberPlate() +
                "Dung tích xy lanh :" + this.getCubicCapacity() +
                ", giá trị xe :" + this.getPrice() +
                '}';
    }
}
