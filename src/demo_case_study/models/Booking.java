package demo_case_study.models;



public class Booking {
    private String bookingId;
    private String startsDay;
    private String endsDay;
    private String customerId;
    private String serviceName;
    private String typeService;

    public Booking() {
    }

    public Booking(String bookingId, String startsDay, String endsDay, String customerId, String serviceName, String typeService) {
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

    public String getTypeService() {
        return typeService;
    }

    public void setTypeService(String typeService) {
        this.typeService = typeService;
    }

    @Override
    public String toString() {
        return bookingId +
                "," + startsDay +
                "," + endsDay +
                "," + customerId +
                "," + serviceName +
                "," + typeService;
    }
}
