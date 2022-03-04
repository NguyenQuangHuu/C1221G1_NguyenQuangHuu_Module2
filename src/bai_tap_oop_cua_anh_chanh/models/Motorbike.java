package bai_tap_oop_cua_anh_chanh.models;

public class Motorbike extends Vehicle {

    private int capacity;


    public Motorbike() {
    }

    public Motorbike(String numberPlate, String vehicleManufacturer, int manufacturingDate, String owner, int capacity) {
        super(numberPlate, vehicleManufacturer, manufacturingDate, owner);
        this.capacity = capacity;
    }

    public Motorbike(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return super.toString()+"," +
                "công suất=" + capacity;
    }


}
