package demo_case_study.models.person;

public abstract class Person {
    private String id;
    private String fullName;
    private String dayOfBirth;
    private String gender;
    private long passportID;
    private String phoneNumber;
    private String email;

    public Person() {
    }

    public Person(String id, String fullName, String dayOfBirth, String gender, long passportID, String phoneNumber, String email) {
        this.id = id;
        this.fullName = fullName;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
        this.passportID = passportID;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getPassportID() {
        return passportID;
    }

    public void setPassportID(long passportID) {
        this.passportID = passportID;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{}";
    }
}
