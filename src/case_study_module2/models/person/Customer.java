package case_study_module2.models.person;

import case_study_module2.models.enums.Gender;
import case_study_module2.models.enums.Membership;

public class Customer extends Person{
    private Membership typeMembership;
    private String address;

    public Customer() {
    }

    public Customer(String id, String fullName, String dayOfBirth, Gender gender, String passportID, String phoneNumber, String email, Membership typeMembership, String address) {
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

        return super.toString()+
                " Customer{" +
                "typeMembership=" + typeMembership +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public String personToString() {
        return super.personToString()+
                " ,"+this.getTypeMembership()+
                " ,"+this.getAddress();
    }
}
