package case_study_module2.models;

import case_study_module2.models.enums.RentType;
import case_study_module2.models.facility.Facility;
import case_study_module2.models.person.Customer;

import java.util.Objects;

public class Booking {
    private int bookingId;
    private String startsDay;
    private String endsDay;
    private Customer customer;
    private Facility facilityName;
    private RentType typeService;

    public Booking() {
    }

    public Booking(int bookingId, String startsDay, String endsDay, Customer customer, Facility facilityName, RentType typeService) {
        this.bookingId = bookingId;
        this.startsDay = startsDay;
        this.endsDay = endsDay;
        this.customer = customer;
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
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
                ", customerId='" + customer + '\'' +
                ", serviceName='" + facilityName + '\'' +
                ", typeService=" + typeService +
                '}';
    }



    public String bookingToString(){
    return bookingId +
                " ," + startsDay +
                " ," + endsDay +
                " ," + customer.getId() +
                " ," + facilityName.getServiceName() +
                " ," + typeService;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Booking)) return false;
        Booking booking = (Booking) o;
        return bookingId == booking.bookingId &&
                startsDay.equals(booking.startsDay) &&
                endsDay.equals(booking.endsDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingId, startsDay, endsDay);
    }
}
