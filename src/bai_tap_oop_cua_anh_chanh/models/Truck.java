package bai_tap_oop_cua_anh_chanh.models;

public class Truck extends Vehicle {
    private int load;

    public Truck(int load) {
        this.load = load;
    }

    public Truck(String numberPlate, String vehicleManufacturer, int manufacturingDate, String owner, int load) {
        super(numberPlate, vehicleManufacturer, manufacturingDate, owner);
        this.load = load;
    }

    public Truck() {
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    @Override
    public String toString() {
        return super.toString()+ ", " +
                load;
    }


}
