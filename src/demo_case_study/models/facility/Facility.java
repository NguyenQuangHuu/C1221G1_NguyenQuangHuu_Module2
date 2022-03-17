package demo_case_study.models.facility;

import java.util.Objects;

public abstract class Facility {
    private String serviceId;
    private String serviceName;
    private double usableArea;
    private double rentExpense;
    private int maximumCapacity;
    private String rentType;


    public Facility() {
    }

    public Facility(String serviceId,String serviceName, double usableArea, double rentExpense, int maximumCapacity, String rentType) {
        this.serviceId = serviceId;
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

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    @Override
    public String toString() {
        return "Tên dịch vụ : "+this.getServiceName()+" , diện tích sử dụng: "+this.getUsableArea();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Facility)) return false;
        Facility facility = (Facility) o;
        return serviceId.equals(facility.serviceId) &&
                serviceName.equals(facility.serviceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceId, serviceName);
    }
}
