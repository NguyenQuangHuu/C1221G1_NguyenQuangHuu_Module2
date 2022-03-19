package case_study_module2.models.facility;

import case_study_module2.models.enums.RentType;

import java.util.Objects;

public abstract class Facility {
    private String serviceName;
    private double usableArea;
    private double rentExpense;
    private int maximumCapacity;
    private RentType rentType;


    public Facility() {
    }

    public Facility(String serviceName, double usableArea, double rentExpense, int maximumCapacity, RentType rentType) {
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

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +
                ", rentExpense=" + rentExpense +
                ", maximumCapacity=" + maximumCapacity +
                ", rentType=" + rentType +
                '}';
    }

    public String facilityToString() {
        return serviceName +
                " ,"+usableArea+
                " ,"+rentExpense+
                " ,"+maximumCapacity+
                " ,"+rentType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Facility)) return false;
        Facility facility = (Facility) o;
        return serviceName.equals(facility.serviceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceName);
    }
}
