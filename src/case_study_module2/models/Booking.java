package case_study_module2.models;

import case_study_module2.models.enums.RentType;
import case_study_module2.models.facility.Facility;

public class Booking {
    private int bookingId;
    private String startsDay;
    private String endsDay;
    private String customerId;
    private Facility facilityName;
    private RentType typeService;

    public Booking() {
    }

    public Booking(int bookingId, String startsDay, String endsDay, String customerId, Facility facilityName, RentType typeService) {
        this.bookingId = bookingId;
        this.startsDay = startsDay;
        this.endsDay = endsDay;
        this.customerId = customerId;
        this.facilityName = facilityName;
        this.typeService = typeService;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
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

    public Facility getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(Facility facilityName) {
        this.facilityName = facilityName;
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
                ", serviceName='" + facilityName + '\'' +
                ", typeService=" + typeService +
                '}';
    }

    public String bookingToString(){
    return bookingId +
                " ," + startsDay +
                " ," + endsDay +
                " ," + customerId +
                " ," + facilityName.getServiceName() +
                " ," + typeService;
    }
}
