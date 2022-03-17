package demo_case_study.models.facility;

public class Villa extends  Facility{
    private String sortOfRoom;
    private double swimmingPoolArea;
    private int numberOfFloors;

    public Villa() {
    }

    public Villa(String sortOfRoom, double swimmingPoolArea, int numberOfFloors) {
        this.sortOfRoom = sortOfRoom;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public Villa(String serviceId,String serviceName, double usableArea, double rentExpense, int maximumCapacity, String rentType, String sortOfRoom, double swimmingPoolArea, int numberOfFloors) {
        super(serviceId,serviceName, usableArea, rentExpense, maximumCapacity, rentType);
        this.sortOfRoom = sortOfRoom;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberOfFloors = numberOfFloors;
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
        return "Villa{" +
                "sortOfRoom='" + sortOfRoom + '\'' +
                ", swimmingPoolArea=" + swimmingPoolArea +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }

}
