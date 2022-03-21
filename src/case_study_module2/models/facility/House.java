package case_study_module2.models.facility;

import case_study_module2.models.enums.RentType;

public class House extends Facility{
    private String serviceId;
    private String sortOfRoom;
    private int numberOfFloors;

    public House() {
    }

    public House(String serviceId,String serviceName, double usableArea, double rentExpense, int maximumCapacity, RentType rentType, String sortOfRoom, int numberOfFloors) {
        super(serviceName, usableArea, rentExpense, maximumCapacity, rentType);
        this.serviceId = serviceId;
        this.sortOfRoom = sortOfRoom;
        this.numberOfFloors = numberOfFloors;
    }

    public House(String sortOfRoom, int numberOfFloors) {
        this.sortOfRoom = sortOfRoom;
        this.numberOfFloors = numberOfFloors;
    }

    public String getSortOfRoom() {
        return sortOfRoom;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public void setSortOfRoom(String sortOfRoom) {
        this.sortOfRoom = sortOfRoom;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return super.toString()+" House{" +
                "serviceId ='"+serviceId+'\''+
                "sortOfRoom='" + sortOfRoom + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }


    @Override
    public String facilityToString() {
        return serviceId+" ,"+
                super.facilityToString()+
                " ,"+ sortOfRoom +
                " ," + numberOfFloors;
    }
}
