package case_study_module_2.models.facility;

public class Room extends Facility{
    private String freeServices;

    public Room() {
    }

    public Room(String serviceName, double usableArea, double rentExpense, int maximumCapacity, String rentType, String freeServices) {
        super(serviceName, usableArea, rentExpense, maximumCapacity, rentType);
        this.freeServices = freeServices;
    }

    public String getFreeServices() {
        return freeServices;
    }

    public void setFreeServices(String freeServices) {
        this.freeServices = freeServices;
    }

    @Override
    public String toString() {
        return super.toString()+", Room{" +
                "freeServices='" + freeServices + '\'' +
                '}';
    }
}
