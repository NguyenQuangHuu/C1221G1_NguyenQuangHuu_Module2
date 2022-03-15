package case_study_module_2.models.facility;

public abstract class Facility {
    private String serviceName;
    private double usableArea;
    private double rentExpense;
    private int maximumCapacity;
    private String rentType;


    public Facility() {
    }

    public Facility(String serviceName, double usableArea, double rentExpense, int maximumCapacity, String rentType) {
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentExpense = rentExpense;
        this.maximumCapacity = maximumCapacity;
        this.rentType = rentType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public double getRentExpense() {
        return rentExpense;
    }

    public void setRentExpense(double rentExpense) {
        this.rentExpense = rentExpense;
    }

    public int getMaximumCapacity() {
        return maximumCapacity;
    }

    public void setMaximumCapacity(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    @Override
    public String toString() {
        return "Tên dịch vụ : "+this.getServiceName()+" , diện tích sử dụng: "+this.getUsableArea();
    }
}
