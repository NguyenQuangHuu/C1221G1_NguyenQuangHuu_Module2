package case_study_module2.models;

import case_study_module2.models.enums.RentType;

public class Booking {
    private String bookingId;
    private String startsDay;
    private String endsDay;
    private String customerId;
    private String serviceName;
    private RentType typeService;

    public Booking() {
    }

    public Booking(String bookingId, String startsDay, String endsDay, String customerId, String serviceName, RentType typeService) {
        this.bookingId = bookingId;
        this.startsDay = startsDay;
        this.endsDay = endsDay;
        this.customerId = customerId;
        this.serviceName = serviceName;
        this.typeService = typeService;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getStartsDay() {
        return startsDay;
    }

    public void setStartsDay(String startsDay) {
        this.startsDay = startsDay;
    }

    public String getEndsDay() {
        return endsDay;
    }

    public void setEndsDay(String endsDay) {
        this.endsDay = endsDay;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public RentType getTypeService() {
        return typeService;
    }

    public void setTypeService(RentType typeService) {
        this.typeService = typeService;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId='" + bookingId + '\'' +
                ", startsDay='" + startsDay + '\'' +
                ", endsDay='" + endsDay + '\'' +
                ", customerId='" + customerId + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", typeService=" + typeService +
                '}';
    }

    public String bookingToString(){
    return bookingId +
                " ," + startsDay +
                " ," + endsDay +
                " ," + customerId +
                " ," + serviceName +
                " ," + typeService;
    }
}
