package bai_tap_file_io_anh_chanh.models;

public class CarType {
    private String typeModel;

    public CarType(String typeModel) {
        this.typeModel = typeModel;
    }

    public String getTypeModel() {
        return typeModel;
    }

    public void setTypeModel(String typeModel) {
        this.typeModel = typeModel;
    }

    @Override
    public String toString() {
        return typeModel;
    }
}
