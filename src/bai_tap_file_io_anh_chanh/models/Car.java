package bai_tap_file_io_anh_chanh.models;

import bai_tap_oop_cua_anh_chanh.models.Vehicle;

public class Car extends Vehicle {
    private int numberCapacity;
    private String model;

    public Car() {
    }

    public Car(String numberPlate, String vehicleManufacturer, int manufacturingDate, String owner, int numberCapacity, String model) {
        super(numberPlate, vehicleManufacturer, manufacturingDate, owner);
        this.numberCapacity = numberCapacity;
        this.model = model;
    }

    public Car(int numberCapacity, String model) {
        this.numberCapacity = numberCapacity;
        this.model = model;
    }


    public int getNumberCapacity() {
        return numberCapacity;
    }

    public void setNumberCapacity(int numberCapacity) {
        this.numberCapacity = numberCapacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return super.getNumberPlate()+", "+
                super.getVehicleManufacturer()+", "+
                super.getManufacturingDate() + ", "+
                super.getOwner() + ", " + numberCapacity+
                ", " + model;
    }
}
