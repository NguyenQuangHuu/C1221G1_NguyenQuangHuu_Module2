package case_study_module2.models.facility;

import case_study_module2.models.enums.RentType;

public class Room extends Facility {
    private String serviceId;
    private String freeServices;

    public Room() {
    }

    public Room(String serviceId, String serviceName, double usableArea, double rentExpense, int maximumCapacity, RentType rentType, String freeServices) {
        super(serviceName, usableArea, rentExpense, maximumCapacity, rentType);
        this.serviceId = serviceId;
        this.freeServices = freeServices;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getFreeServices() {
        return freeServices;
    }

    public void setFreeServices(String freeServices) {
        this.freeServices = freeServices;
    }


    @Override
    public String toString() {
        return
                super.toString() +
                        " , Room{" +
                        "serviceId ='" + serviceId + '\'' +
                        "freeServices='" + freeServices + '\'' +
                        '}';
    }

    @Override
    public String facilityToString() {
        return serviceId + " ," +
                super.facilityToString() + " ," +
                freeServices;
    }
}
