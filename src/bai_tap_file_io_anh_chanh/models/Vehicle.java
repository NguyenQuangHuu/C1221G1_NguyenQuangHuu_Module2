package bai_tap_file_io_anh_chanh.models;

public abstract class Vehicle {
    private String numberPlate;
    private String vehicleManufacturer;
    private int manufacturingDate;
    private String owner;

    public Vehicle() {
    }

    public Vehicle(String numberPlate, String vehicleManufacturer, int manufacturingDate, String owner) {
        this.numberPlate = numberPlate;
        this.vehicleManufacturer = vehicleManufacturer;
        this.manufacturingDate = manufacturingDate;
        this.owner = owner;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String getVehicleManufacturer() {
        return vehicleManufacturer;
    }

    public void setVehicleManufacturer(String vehicleManufacturer) {
        this.vehicleManufacturer = vehicleManufacturer;
    }

    public int getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(int manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return numberPlate +
                ", " + vehicleManufacturer +
                ", " + manufacturingDate +
                ", " + owner
                ;
    }
}
