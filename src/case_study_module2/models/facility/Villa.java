package case_study_module2.models.facility;

import case_study_module2.models.enums.RentType;

public class Villa extends Facility {
    private String serviceId;
    private String sortOfRoom;
    private double swimmingPoolArea;
    private int numberOfFloors;

    public Villa() {
    }

    public Villa(String serviceId, String sortOfRoom, double swimmingPoolArea, int numberOfFloors) {
        this.serviceId = serviceId;
        this.sortOfRoom = sortOfRoom;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public Villa(String serviceId, String serviceName, double usableArea, double rentExpense, int maximumCapacity, RentType rentType, String sortOfRoom, double swimmingPoolArea, int numberOfFloors) {
        super(serviceName, usableArea, rentExpense, maximumCapacity, rentType);
        this.serviceId = serviceId;
        this.sortOfRoom = sortOfRoom;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberOfFloors = numberOfFloors;
    }


    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getSortOfRoom() {
        return sortOfRoom;
    }

    public void setSortOfRoom(String sortOfRoom) {
        this.sortOfRoom = sortOfRoom;
    }

    public double getSwimmingPoolArea() {
        return swimmingPoolArea;
    }

    public void setSwimmingPoolArea(double swimmingPoolArea) {
        this.swimmingPoolArea = swimmingPoolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return super.toString()+" Villa{" +
                "serviceId ='"+serviceId+'\''+
                "sortOfRoom='" + sortOfRoom + '\'' +
                ", swimmingPoolArea=" + swimmingPoolArea +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }

    @Override
    public String facilityToString() {
        return  serviceId+" ,"+
                super.facilityToString()+ " ," +
                sortOfRoom + " ," +
                swimmingPoolArea + " ," +
                numberOfFloors;
    }

}
