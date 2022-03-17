package demo_case_study.models.facility;

public class House extends Facility{

    private String sortOfRoom;
    private int numberOfFloors;

    public House() {
    }

    public House(String serviceId,String serviceName, double usableArea, double rentExpense, int maximumCapacity, String rentType, String sortOfRoom, int numberOfFloors) {
        super(serviceId,serviceName, usableArea, rentExpense, maximumCapacity, rentType);
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
        return "House{" +
                "sortOfRoom='" + sortOfRoom + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}
