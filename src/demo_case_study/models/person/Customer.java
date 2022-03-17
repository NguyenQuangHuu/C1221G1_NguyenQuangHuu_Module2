package demo_case_study.models.person;

public class Customer extends Person{
    private Membership typeMembership;
    private String address;

    private final String DIAMOND = "Diamond";
    private final String PLATINUM = "Platinum";
    private final String GOLD = "Gold";
    private final String SILVER = "Silver";
    private final String MEMBER = "Member";

    public Customer() {
    }

    public Customer(String id, String fullName, String dayOfBirth, String gender, long passportID, String phoneNumber, String email, Membership typeMembership, String address) {
        super(id, fullName, dayOfBirth, gender, passportID, phoneNumber, email);
        this.typeMembership = typeMembership;
        this.address = address;
    }

    public Membership getTypeMembership() {
        return typeMembership;
    }

    public void setTypeMembership(Membership typeMembership) {
        this.typeMembership = typeMembership;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{}";
    }
}
