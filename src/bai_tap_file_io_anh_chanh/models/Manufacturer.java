package bai_tap_file_io_anh_chanh.models;

public class Manufacturer {
    private String id;
    private String manufacturerName;
    private String country;

    public Manufacturer(String id, String manufacturerName, String country) {
        this.id = id;
        this.manufacturerName = manufacturerName;
        this.country = country;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }



    @Override
    public String toString() {
        return "Manufacturer{" +
                "id='" + id + '\'' +
                ", manufacturerName='" + manufacturerName + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
